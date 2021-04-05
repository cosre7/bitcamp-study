package com.eomcs.mybatis.vo;

public class AttachFile {
  int fileNo; // 고유번호
  String filePath;
  int boardNo; // 게시글 번호

  public AttachFile() {
  }

  public AttachFile(int boardNo, String filePath) {
    this.boardNo = boardNo;
    this.filePath = filePath;
  }

  public int getFileNo() {
    return fileNo;
  }
  public void setFileNo(int fileNo) {
    this.fileNo = fileNo;
  }
  public String getFilePath() {
    return filePath;
  }
  public void setFilePath(String filePath) {
    this.filePath = filePath;
  }
  public int getBoardNo() {
    return boardNo;
  }
  public void setBoardNo(int boardNo) {
    this.boardNo = boardNo;
  }
}
