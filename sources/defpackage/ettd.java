package defpackage;

import java.security.GeneralSecurityException;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class ettd implements etti {
    public final String a;
    public final eujt b;
    public final eyee c;
    public final euag d;
    public final Integer e;
    public final int f;

    private ettd(String str, eujt eujtVar, eyee eyeeVar, int i, euag euagVar, Integer num) {
        this.a = str;
        this.b = eujtVar;
        this.c = eyeeVar;
        this.f = i;
        this.d = euagVar;
        this.e = num;
    }

    public static ettd a(String str, eyee eyeeVar, int i, euag euagVar, Integer num) {
        if (euagVar == euag.RAW) {
            if (num != null) {
                throw new GeneralSecurityException("Keys with output prefix type raw should not have an id requirement.");
            }
        } else if (num == null) {
            throw new GeneralSecurityException("Keys with output prefix type different from raw should have an id requirement.");
        }
        return new ettd(str, ettp.a(str), eyeeVar, i, euagVar, num);
    }
}
