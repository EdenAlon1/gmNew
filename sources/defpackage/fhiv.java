package defpackage;

import java.util.regex.Pattern;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class fhiv extends fhhe {
    private final String a;
    private final long b;
    private final fhmv c;

    public fhiv(String str, long j, fhmv fhmvVar) {
        this.a = str;
        this.b = j;
        this.c = fhmvVar;
    }

    @Override // defpackage.fhhe
    public final long a() {
        return this.b;
    }

    @Override // defpackage.fhhe
    public final fhgn b() {
        String str = this.a;
        if (str != null) {
            Pattern pattern = fhgn.a;
            try {
                return fhgm.a(str);
            } catch (IllegalArgumentException unused) {
            }
        }
        return null;
    }

    @Override // defpackage.fhhe
    public final fhmv c() {
        return this.c;
    }
}
