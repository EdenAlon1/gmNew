package defpackage;

import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crtw extends RuntimeException {
    public crtw() {
        super("Response does not contain a status for each requested participant");
        Optional.empty();
    }

    public crtw(String str, String str2) {
        super(str2);
        Optional.of(str);
    }
}
