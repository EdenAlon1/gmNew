package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public enum cdps {
    UNKNOWN_FAILURE("BugleCmsUnknown failure. Upload failed due to tachyon services\n"),
    HTTP_RESPONSE_ERROR("BugleCmsNon 200 response code\n"),
    HTTP_EMPTY_RESPONSE("BugleCmsUpload has empty response\n"),
    ENCRYPTION_ERROR("BugleCmsEncryption failed before uploading can happen\n"),
    COMPRESS_IMAGE_ERROR("BugleCmsCompress failed before uploading can happen\n"),
    OUT_OF_SQS_STORAGE_ERROR("BugleCmsUnretryably failed because of no storage in SQS."),
    FILE_NOT_FOUND_ORIGINAL("BugleCmsOriginal File not found before uploading."),
    FILE_NOT_FOUND_WRITE_SCRATCH_SPACE("BugleCmsScratch space file not found when tries to write.");

    final String i;

    cdps(String str) {
        this.i = str;
    }
}
