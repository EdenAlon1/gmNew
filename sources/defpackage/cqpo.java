package defpackage;

import com.google.android.ims.rcsservice.filetransfer.FileTransferEvent;
import com.google.android.ims.rcsservice.filetransfer.FileTransferResult;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cqpo {
    public static final ensn a = new ensn("transfer_id", String.class, false, false);
    public static final ensn b = new ensn("transfer_handle", String.class, false, false);
    public static final ensn c = new ensn("num_redirects", Integer.class, false, false);
    public static final ensn d = new ensn("http_status_code", Integer.class, false, false);
    public static final ensn e = new ensn("bytes_uploaded", Long.class, false, false);
    public static final ensn f = new ensn("total_bytes", Long.class, false, false);
    public static final ensn g = new ensn("file_transfer_Event", FileTransferEvent.class, false, false);
    public static final ensn h;
    public static final ensn i;
    public static final ensn j;

    static {
        new ensn("content_type", String.class, false, false);
        h = new ensn("file_transfer_result", FileTransferResult.class, false, false);
        i = new ensn("in_progress_file_transfer_state", String.class, false, false);
        j = new ensn("file_processing_id", awap.class, false, false);
    }
}
