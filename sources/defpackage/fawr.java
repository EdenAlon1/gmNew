package defpackage;

import java.security.MessageDigest;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class fawr {
    public static void a() {
        emxc b = emxc.i(null).b(new emwl() { // from class: fawq
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return ((MessageDigest) obj).getAlgorithm();
            }
        });
        if (b.g()) {
            if (emuz.e((CharSequence) b.c(), "md5") || emuz.e((CharSequence) b.c(), "sha-1")) {
                emuz.e((CharSequence) b.c(), "md5");
                eoeg eoegVar = eoeg.e;
                throw null;
            }
        }
    }
}
