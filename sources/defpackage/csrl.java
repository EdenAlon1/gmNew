package defpackage;

import java.io.File;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class csrl {
    public static final void a(File file) {
        if (file.exists()) {
            file.setReadable(true, false);
        }
    }
}
