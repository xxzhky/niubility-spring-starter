package com.north.lat.test;

import java.util.Base64;

/**
 * @author: Fred
 * @date: 2022/3/10 11:15 上午
 * @description: (类的描述)
 */
public class HashUtils {
    /**
     * base64 encode
     *
     * @param str
     * @return
     */
    public static String base64(String str) {
        return Base64.getEncoder().encodeToString(str.getBytes());
    }

    /**
     * base64 decode
     *
     * @param str
     * @return
     */
    public static String debase64(String str) {
        return new String(Base64.getDecoder().decode(str));
    }

    public static void main(String[] args) {
        String ss = debase64("eyJwcml2YXRlUGFyYW0iOnsiaXNDaGVjayI6ZmFsc2UsInRlY2hDaGVjayI6eyJpZCI6IjQiLCJuYW1lIjoi5oqA5pyv5qOA5qC4IiwidHlwZSI6InRyYW5zZm9ybSIsIm9wZXJhdG9yX25hbWUiOiJ0ZWNoQ2hlY2siLCJzdHJhdGVneSI6eyJjbGF6eiI6IiIsImNvbmZpZyI6eyJjaGVja19zaW5rX251bXMiOjAsImRiX25hbWUiOiJoaXZlRGJfMjAyMjAxMjAxNDMxNTY1NDUiLCJ0YWJsZV9uYW1lIjoiaGl2ZXRiXzIwMjIwMTIwMTQzMTU4NDMzIiwiZXh0ZW5kZXIiOnsiY2hlY2siOnsiY2xhenoiOiIiLCJwYXJhbXMiOnsiZHNfaWQiOjEsImRzX3R5cGUiOiJoaXZlIiwiZHNfbmFtZSI6ImRlZmF1bHRIaXZlIiwicHJvamVjdF9pZCI6MjU3LCJwcm9qZWN0X25hbWUiOiJ5c21BdXRvVGVzdE5vUm9vdCIsInJ1bGVfaWRzIjpbXX19fSwiZXh0cmFjdF9maWVsZHMiOlt7ImZpZWxkIjoiYWEiLCJkYXRhX3R5cGUiOiJTVFJJTkciLCJsZW5ndGgiOiI1MCIsImZpZWxkX3R5cGUiOiIiLCJvcHRpb24iOnsidGVjaF9jaGVjayI6eyJvbl9vZmYiOmZhbHNlLCJydWxlX29wdGlvbnMiOltdfX19LHsiZmllbGQiOiJiYiIsImRhdGFfdHlwZSI6Ik5VTUJFUiIsImxlbmd0aCI6IjkiLCJmaWVsZF90eXBlIjoiIiwib3B0aW9uIjp7InRlY2hfY2hlY2siOnsib25fb2ZmIjpmYWxzZSwicnVsZV9vcHRpb25zIjpbXX19fSx7ImZpZWxkIjoiY2MiLCJkYXRhX3R5cGUiOiJERUNJTUFMIiwibGVuZ3RoIjoiMjAsMTgiLCJmaWVsZF90eXBlIjoiIiwib3B0aW9uIjp7InRlY2hfY2hlY2siOnsib25fb2ZmIjpmYWxzZSwicnVsZV9vcHRpb25zIjpbXX19fSx7ImZpZWxkIjoiZGQiLCJkYXRhX3R5cGUiOiJEQVRFIiwibGVuZ3RoIjoiNTAiLCJmaWVsZF90eXBlIjoiIiwib3B0aW9uIjp7InRlY2hfY2hlY2siOnsib25fb2ZmIjpmYWxzZSwicnVsZV9vcHRpb25zIjpbXX19fSx7ImZpZWxkIjoiZWUiLCJkYXRhX3R5cGUiOiJUSU1FIiwibGVuZ3RoIjoiOCIsImZpZWxkX3R5cGUiOiIiLCJvcHRpb24iOnsidGVjaF9jaGVjayI6eyJvbl9vZmYiOmZhbHNlLCJydWxlX29wdGlvbnMiOltdfX19LHsiZmllbGQiOiJmZiIsImRhdGFfdHlwZSI6IkRBVEVUSU1FIiwibGVuZ3RoIjoiMTkiLCJmaWVsZF90eXBlIjoiIiwib3B0aW9uIjp7InRlY2hfY2hlY2siOnsib25fb2ZmIjpmYWxzZSwicnVsZV9vcHRpb25zIjpbXX19fV19fX0sInNpbmtQYXJhbXMiOnsiaWQiOiIzIiwibmFtZSI6IiIsInR5cGUiOiJzaW5rIiwib3BlcmF0b3JfbmFtZSI6ImhpdmUiLCJzdHJhdGVneSI6eyJjbGF6eiI6IiIsImNvbmZpZyI6eyJkYl9uYW1lIjoiaGl2ZVBhRGJfMjAyMjAxMjAxNDMxMzcxNjIiLCJ0YWJsZV9uYW1lIjoiaGl2ZVBhdGJfMjAyMjAxMjAxNDMxMzk0NzYiLCJ3cml0ZV9vcHRpb24iOiJvdmVyd3JpdGUiLCJsb2dpY19wayI6W10sImFkdmFuY2VkX29wdGlvbnMiOnsiZGF0YV9zcGxpdCI6eyJvbl9vZmYiOnRydWUsIm51bXMiOjIwfSwiY29tbWl0X3JlY29kcyI6MTAwMDB9LCJleHRlbmRlciI6eyJhdXRoIjp7ImNsYXp6IjoiIiwicGFyYW1zIjp7InByb2plY3RfaWQiOjI1NywicHJvamVjdF9uYW1lIjoieXNtQXV0b1Rlc3ROb1Jvb3QiLCJkc190eXBlIjoiaGl2ZSIsImRzX2lkIjoxLCJkc19uYW1lIjoiZGVmYXVsdEhpdmUifX0sIm1ldGEiOnsiY2xhenoiOiIiLCJwYXJhbXMiOnsicHJvamVjdF9pZCI6MjU3LCJwcm9qZWN0X25hbWUiOiJ5c21BdXRvVGVzdE5vUm9vdCIsImRzX3R5cGUiOiJoaXZlIiwiZHNfaWQiOjEsImRzX25hbWUiOiJkZWZhdWx0SGl2ZSJ9fX0sImV4dHJhY3RfZmllbGRzIjpbeyJmaWVsZCI6ImFhIiwiZGF0YV90eXBlIjoiU1RSSU5HIiwibGVuZ3RoIjoiNTAiLCJmaWVsZF90eXBlIjoiIiwiZnJvbV9maWVsZCI6ImFhIiwibm9fY2hlY2siOmZhbHNlLCJmaWVsZF9wcm9wcyI6eyJpc19wYXJ0aXRpb24iOnRydWUsImtleV90eXBlIjoiIiwiZGVmYXVsdF92YWx1ZSI6IiIsInBhcnRpdGlvbl9pbmZvIjoiZHluYW1pYy1wYXJ0aXRpb24ifX0seyJmaWVsZCI6ImJiIiwiZGF0YV90eXBlIjoiTlVNQkVSIiwibGVuZ3RoIjoiOSIsImZpZWxkX3R5cGUiOiIiLCJmcm9tX2ZpZWxkIjoiYmIiLCJub19jaGVjayI6ZmFsc2UsImZpZWxkX3Byb3BzIjp7ImlzX3BhcnRpdGlvbiI6dHJ1ZSwia2V5X3R5cGUiOiIiLCJkZWZhdWx0X3ZhbHVlIjoiIiwicGFydGl0aW9uX2luZm8iOiJkeW5hbWljLXBhcnRpdGlvbiJ9fSx7ImZpZWxkIjoiY2MiLCJkYXRhX3R5cGUiOiJERUNJTUFMIiwibGVuZ3RoIjoiMTAsMiIsImZpZWxkX3R5cGUiOiIiLCJmcm9tX2ZpZWxkIjoiY2MiLCJub19jaGVjayI6ZmFsc2UsImZpZWxkX3Byb3BzIjp7ImlzX3BhcnRpdGlvbiI6ZmFsc2UsImtleV90eXBlIjoiIiwiZGVmYXVsdF92YWx1ZSI6IjExMS4xMSIsInBhcnRpdGlvbl9pbmZvIjoiZHluYW1pYy1wYXJ0aXRpb24ifX0seyJmaWVsZCI6ImRkIiwiZGF0YV90eXBlIjoiREFURSIsImxlbmd0aCI6IjUwIiwiZmllbGRfdHlwZSI6IiIsImZyb21fZmllbGQiOiJkZCIsIm5vX2NoZWNrIjpmYWxzZSwiZmllbGRfcHJvcHMiOnsiaXNfcGFydGl0aW9uIjpmYWxzZSwia2V5X3R5cGUiOiIiLCJkZWZhdWx0X3ZhbHVlIjoiIiwicGFydGl0aW9uX2luZm8iOiJkeW5hbWljLXBhcnRpdGlvbiJ9fSx7ImZpZWxkIjoiZWUiLCJkYXRhX3R5cGUiOiJUSU1FIiwibGVuZ3RoIjoiOCIsImZpZWxkX3R5cGUiOiIiLCJmcm9tX2ZpZWxkIjoiZWUiLCJub19jaGVjayI6ZmFsc2UsImZpZWxkX3Byb3BzIjp7ImlzX3BhcnRpdGlvbiI6ZmFsc2UsImtleV90eXBlIjoiIiwiZGVmYXVsdF92YWx1ZSI6IiIsInBhcnRpdGlvbl9pbmZvIjoiZHluYW1pYy1wYXJ0aXRpb24ifX0seyJmaWVsZCI6ImZmIiwiZGF0YV90eXBlIjoiREFURVRJTUUiLCJsZW5ndGgiOiIxOSIsImZpZWxkX3R5cGUiOiIiLCJmcm9tX2ZpZWxkIjoiZmYiLCJub19jaGVjayI6ZmFsc2UsImZpZWxkX3Byb3BzIjp7ImlzX3BhcnRpdGlvbiI6ZmFsc2UsImtleV90eXBlIjoiIiwiZGVmYXVsdF92YWx1ZSI6IiIsInBhcnRpdGlvbl9pbmZvIjoiZHluYW1pYy1wYXJ0aXRpb24ifX1dLCJzeW5jX21vZGUiOiJqZGJjIn19fSwic291cmNlUGFyYW1zIjp7ImlkIjoiMSIsIm5hbWUiOiIiLCJ0eXBlIjoic291cmNlIiwib3BlcmF0b3JfbmFtZSI6ImhpdmUiLCJzdHJhdGVneSI6eyJjb25maWciOnsiZGJfbmFtZSI6ImhpdmVEYl8yMDIyMDEyMDE0MzE1NjU0NSIsInRhYmxlX25hbWUiOiJoaXZldGJfMjAyMjAxMjAxNDMxNTg0MzMiLCJmaWx0ZXIiOiJiYj4wIiwiYWR2YW5jZWRfb3B0aW9ucyI6eyJpZ25vcmVfYWJub3JtYWwiOnsib25fb2ZmIjp0cnVlfX0sImV4dGVuZGVyIjp7ImF1dGgiOnsiY2xhenoiOiIiLCJwYXJhbXMiOnsiZHNfdHlwZSI6ImhpdmUiLCJkc19pZCI6MSwiZHNfbmFtZSI6ImRlZmF1bHRIaXZlIiwicHJvamVjdF9uYW1lIjoieXNtQXV0b1Rlc3ROb1Jvb3QiLCJwcm9qZWN0X2lkIjoyNTd9fSwibWV0YSI6eyJjbGF6eiI6IiIsInBhcmFtcyI6eyJkc190eXBlIjoiaGl2ZSIsImRzX2lkIjoxLCJkc19uYW1lIjoiZGVmYXVsdEhpdmUiLCJwcm9qZWN0X25hbWUiOiJ5c21BdXRvVGVzdE5vUm9vdCIsInByb2plY3RfaWQiOjI1N319fSwiZXh0cmFjdF9maWVsZHMiOlt7ImNvbE5hbWUiOiJhYSIsImNvbFR5cGUiOiJTVFJJTkciLCJpc1BhcnRpdGlvbiI6ZmFsc2UsImxlbmd0aCI6IjUwIiwiY29sQ29kZSI6ImNvbC0wMmZhYjg2OTdlZTQ0MjlmODQ2Njc4Yzk3NDQwYzg4NiIsInRlY2hMb2dpY1RhYmxlSWQiOjQ1ODcsInN0YW5kYXJkVHlwZSI6ZmFsc2UsImlkIjoxNjg5MDQsInBvc2l0aW9uIjowLCJwYXJhbXMiOlt7InBrZXlDaHMiOm51bGwsInBWYWx1ZSI6ImZhbHNlIiwiaWQiOjgwNzEwMCwicEtleSI6IlBSSU1BUllfS0VZIn0seyJwa2V5Q2hzIjpudWxsLCJwVmFsdWUiOiJmYWxzZSIsImlkIjo4MDcxMDEsInBLZXkiOiJOT1RfTlVMTCJ9LHsicGtleUNocyI6bnVsbCwicFZhbHVlIjoiNSIsImlkIjo4MDcxMDIsInBLZXkiOiJFTkNSWVBUX0xFVkVMIn0seyJwa2V5Q2hzIjpudWxsLCJwVmFsdWUiOiIwIiwiaWQiOjgwNzEwMywicEtleSI6IkRFU0VOU0lUSVpBVElPTl9UWVBFIn0seyJwa2V5Q2hzIjpudWxsLCJwVmFsdWUiOiJuYWMuLjUwIiwiaWQiOjgwNzEwNCwicEtleSI6IkFOQ19FWFBSRVNTIn1dfSx7ImNvbE5hbWUiOiJiYiIsImNvbFR5cGUiOiJOVU1CRVIiLCJpc1BhcnRpdGlvbiI6ZmFsc2UsImxlbmd0aCI6IjkiLCJjb2xDb2RlIjoiY29sLWNhMmI4NjI3YTNiODRhMGU4MWM5MTRhYjJjNzAwNGZmIiwidGVjaExvZ2ljVGFibGVJZCI6NDU4Nywic3RhbmRhcmRUeXBlIjpmYWxzZSwiaWQiOjE2ODkwNSwicG9zaXRpb24iOjAsInBhcmFtcyI6W3sicGtleUNocyI6bnVsbCwicFZhbHVlIjoiZmFsc2UiLCJpZCI6ODA3MTI1LCJwS2V5IjoiUFJJTUFSWV9LRVkifSx7InBrZXlDaHMiOm51bGwsInBWYWx1ZSI6ImZhbHNlIiwiaWQiOjgwNzEyNiwicEtleSI6Ik5PVF9OVUxMIn0seyJwa2V5Q2hzIjpudWxsLCJwVmFsdWUiOiI1IiwiaWQiOjgwNzEyNywicEtleSI6IkVOQ1JZUFRfTEVWRUwifSx7InBrZXlDaHMiOm51bGwsInBWYWx1ZSI6IjAiLCJpZCI6ODA3MTI4LCJwS2V5IjoiREVTRU5TSVRJWkFUSU9OX1RZUEUifSx7InBrZXlDaHMiOm51bGwsInBWYWx1ZSI6Im4uLjkiLCJpZCI6ODA3MTI5LCJwS2V5IjoiQU5DX0VYUFJFU1MifV19LHsiY29sTmFtZSI6ImNjIiwiY29sVHlwZSI6IkRFQ0lNQUwiLCJpc1BhcnRpdGlvbiI6ZmFsc2UsImxlbmd0aCI6IjIwLDE4IiwiY29sQ29kZSI6ImNvbC02ZjM2ODkxNmYyNWE0YTE0ODFiY2RlZGQ4NWU5Y2ViMSIsInRlY2hMb2dpY1RhYmxlSWQiOjQ1ODcsInN0YW5kYXJkVHlwZSI6ZmFsc2UsImlkIjoxNjg5MDYsInBvc2l0aW9uIjowLCJwYXJhbXMiOlt7InBrZXlDaHMiOm51bGwsInBWYWx1ZSI6ImZhbHNlIiwiaWQiOjgwNzExNSwicEtleSI6IlBSSU1BUllfS0VZIn0seyJwa2V5Q2hzIjpudWxsLCJwVmFsdWUiOiJmYWxzZSIsImlkIjo4MDcxMTYsInBLZXkiOiJOT1RfTlVMTCJ9LHsicGtleUNocyI6bnVsbCwicFZhbHVlIjoiNSIsImlkIjo4MDcxMTcsInBLZXkiOiJFTkNSWVBUX0xFVkVMIn0seyJwa2V5Q2hzIjpudWxsLCJwVmFsdWUiOiIwIiwiaWQiOjgwNzExOCwicEtleSI6IkRFU0VOU0lUSVpBVElPTl9UWVBFIn0seyJwa2V5Q2hzIjpudWxsLCJwVmFsdWUiOiIyMG4oMTgpIiwiaWQiOjgwNzExOSwicEtleSI6IkFOQ19FWFBSRVNTIn1dfSx7ImNvbE5hbWUiOiJkZCIsImNvbFR5cGUiOiJEQVRFIiwiaXNQYXJ0aXRpb24iOmZhbHNlLCJsZW5ndGgiOiI1MCIsImNvbENvZGUiOiJjb2wtNzVlNjY5ZjY4ZWMzNDQ0MDkxYzM0NTkyYjYwZTgyMjQiLCJ0ZWNoTG9naWNUYWJsZUlkIjo0NTg3LCJzdGFuZGFyZFR5cGUiOmZhbHNlLCJpZCI6MTY4OTA3LCJwb3NpdGlvbiI6MCwicGFyYW1zIjpbeyJwa2V5Q2hzIjpudWxsLCJwVmFsdWUiOiJmYWxzZSIsImlkIjo4MDcxMjAsInBLZXkiOiJQUklNQVJZX0tFWSJ9LHsicGtleUNocyI6bnVsbCwicFZhbHVlIjoiZmFsc2UiLCJpZCI6ODA3MTIxLCJwS2V5IjoiTk9UX05VTEwifSx7InBrZXlDaHMiOm51bGwsInBWYWx1ZSI6IjUiLCJpZCI6ODA3MTIyLCJwS2V5IjoiRU5DUllQVF9MRVZFTCJ9LHsicGtleUNocyI6bnVsbCwicFZhbHVlIjoiMCIsImlkIjo4MDcxMjMsInBLZXkiOiJERVNFTlNJVElaQVRJT05fVFlQRSJ9LHsicGtleUNocyI6bnVsbCwicFZhbHVlIjoiWVlZWS1NTS1ERCIsImlkIjo4MDcxMjQsInBLZXkiOiJBTkNfRVhQUkVTUyJ9XX0seyJjb2xOYW1lIjoiZWUiLCJjb2xUeXBlIjoiVElNRSIsImlzUGFydGl0aW9uIjpmYWxzZSwibGVuZ3RoIjoiOCIsImNvbENvZGUiOiJjb2wtM2JmZDBmZjM5NGIwNGY3Y2FhODgzMTk3MjY2YWY1NGUiLCJ0ZWNoTG9naWNUYWJsZUlkIjo0NTg3LCJzdGFuZGFyZFR5cGUiOmZhbHNlLCJpZCI6MTY4OTA4LCJwb3NpdGlvbiI6MCwicGFyYW1zIjpbeyJwa2V5Q2hzIjpudWxsLCJwVmFsdWUiOiJmYWxzZSIsImlkIjo4MDcxMTAsInBLZXkiOiJQUklNQVJZX0tFWSJ9LHsicGtleUNocyI6bnVsbCwicFZhbHVlIjoiZmFsc2UiLCJpZCI6ODA3MTExLCJwS2V5IjoiTk9UX05VTEwifSx7InBrZXlDaHMiOm51bGwsInBWYWx1ZSI6IjUiLCJpZCI6ODA3MTEyLCJwS2V5IjoiRU5DUllQVF9MRVZFTCJ9LHsicGtleUNocyI6bnVsbCwicFZhbHVlIjoiMCIsImlkIjo4MDcxMTMsInBLZXkiOiJERVNFTlNJVElaQVRJT05fVFlQRSJ9LHsicGtleUNocyI6bnVsbCwicFZhbHVlIjoiSEg6TU06U1M6Tk5OIiwiaWQiOjgwNzExNCwicEtleSI6IkFOQ19FWFBSRVNTIn1dfSx7ImNvbE5hbWUiOiJmZiIsImNvbFR5cGUiOiJEQVRFVElNRSIsImlzUGFydGl0aW9uIjpmYWxzZSwibGVuZ3RoIjoiMTkiLCJjb2xDb2RlIjoiY29sLTA4OTc1ZGE0OTMxZDQxNDZiZjVmNDNkZTc2MjM2NjU5IiwidGVjaExvZ2ljVGFibGVJZCI6NDU4Nywic3RhbmRhcmRUeXBlIjpmYWxzZSwiaWQiOjE2ODkwOSwicG9zaXRpb24iOjAsInBhcmFtcyI6W3sicGtleUNocyI6bnVsbCwicFZhbHVlIjoiZmFsc2UiLCJpZCI6ODA3MTA1LCJwS2V5IjoiUFJJTUFSWV9LRVkifSx7InBrZXlDaHMiOm51bGwsInBWYWx1ZSI6ImZhbHNlIiwiaWQiOjgwNzEwNiwicEtleSI6Ik5PVF9OVUxMIn0seyJwa2V5Q2hzIjpudWxsLCJwVmFsdWUiOiI1IiwiaWQiOjgwNzEwNywicEtleSI6IkVOQ1JZUFRfTEVWRUwifSx7InBrZXlDaHMiOm51bGwsInBWYWx1ZSI6IjAiLCJpZCI6ODA3MTA4LCJwS2V5IjoiREVTRU5TSVRJWkFUSU9OX1RZUEUifSx7InBrZXlDaHMiOm51bGwsInBWYWx1ZSI6IllZWVktTU0tRERUSEg6TU06U1M6Tk5OIiwiaWQiOjgwNzEwOSwicEtleSI6IkFOQ19FWFBSRVNTIn1dfV19fX0sInNvdXJjZU1hcHBpbmciOnsiaWQiOiIyIiwibmFtZSI6IiIsInR5cGUiOiJ0cmFuc2Zvcm0iLCJvcGVyYXRvcl9uYW1lIjoiZmlsdGVyLW1hcCIsInN0cmF0ZWd5Ijp7ImNsYXp6IjoiIiwiY29uZmlnIjp7ImZpbHRlciI6IiIsImV4dHJhY3RfZmllbGRzIjpbeyJmaWVsZCI6ImFhIiwidGFnIjoic291cmNlX2NvbHVtbiIsImRhdGFfdHlwZSI6IlNUUklORyIsIm9wdGlvbiI6IiIsImxlbmd0aCI6IjUwIiwiZmllbGRfdHlwZSI6IiJ9LHsiZmllbGQiOiJiYiIsInRhZyI6InNvdXJjZV9jb2x1bW4iLCJkYXRhX3R5cGUiOiJOVU1CRVIiLCJvcHRpb24iOiIiLCJsZW5ndGgiOiI5IiwiZmllbGRfdHlwZSI6IiJ9LHsiZmllbGQiOiJjYyIsInRhZyI6InNvdXJjZV9jb2x1bW4iLCJkYXRhX3R5cGUiOiJERUNJTUFMIiwib3B0aW9uIjoiZmxvb3IoY2MpIiwibGVuZ3RoIjoiMjAsMTgiLCJmaWVsZF90eXBlIjoiIn0seyJmaWVsZCI6ImRkIiwidGFnIjoic291cmNlX2NvbHVtbiIsImRhdGFfdHlwZSI6IkRBVEUiLCJvcHRpb24iOiIiLCJsZW5ndGgiOiI1MCIsImZpZWxkX3R5cGUiOiIifSx7ImZpZWxkIjoiZWUiLCJ0YWciOiJzb3VyY2VfY29sdW1uIiwiZGF0YV90eXBlIjoiVElNRSIsIm9wdGlvbiI6IiIsImxlbmd0aCI6IjgiLCJmaWVsZF90eXBlIjoiIn0seyJmaWVsZCI6ImZmIiwidGFnIjoic291cmNlX2NvbHVtbiIsImRhdGFfdHlwZSI6IkRBVEVUSU1FIiwib3B0aW9uIjoiIiwibGVuZ3RoIjoiMTkiLCJmaWVsZF90eXBlIjoiIn1dfX19LCJzeW5jX3R5cGUiOiJzaW5nbGUifSwiY3VzdG9tUGFyYW0iOnt9LCJpbnB1dFBhcmFtIjpbXSwib3V0cHV0UGFyYW0iOltdLCJ0ZW1wbGF0ZVBhcmFtIjp7fX0");
        System.out.println(ss);

    }
}

