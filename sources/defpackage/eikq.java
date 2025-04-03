package defpackage;

import com.google.android.rcs.client.messaging.data.ContentType;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eikq extends eikm {
    public eikq(ContentType contentType, String str) {
        super("Unexpected Content-type: '" + contentType.toString() + "'. " + str);
    }
}
