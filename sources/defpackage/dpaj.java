package defpackage;

import com.android.vcard.VCardConstants;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dpaj implements dpae {
    public static final dpaj a;
    public static final dpaj b;
    public static final dpaj c;
    public static final dpaj d;
    private static final /* synthetic */ dpaj[] f;
    public final enip e;
    private final /* synthetic */ dpai g;

    static {
        enip u = enip.u(dpab.b, dpab.c, dpab.d, dpab.e, dpab.g);
        u.getClass();
        dpaj dpajVar = new dpaj("AUDIO", 0, u);
        a = dpajVar;
        enip u2 = enip.u(dpab.b, dpab.c, dpab.d, dpab.e, dpab.f);
        u2.getClass();
        dpaj dpajVar2 = new dpaj("IMAGE", 1, u2);
        b = dpajVar2;
        enip v = enip.v(dpab.b, dpab.c, dpab.d, dpab.e, dpab.f, dpab.g, new dpab[0]);
        v.getClass();
        dpaj dpajVar3 = new dpaj(VCardConstants.PARAM_TYPE_VIDEO, 2, v);
        c = dpajVar3;
        enip t = enip.t(dpab.b, dpab.c, dpab.d, dpab.e);
        t.getClass();
        dpaj dpajVar4 = new dpaj("ARBITRARY_FILE", 3, t);
        d = dpajVar4;
        dpaj[] dpajVarArr = {dpajVar, dpajVar2, dpajVar3, dpajVar4};
        f = dpajVarArr;
        ffhw.a(dpajVarArr);
    }

    public /* synthetic */ dpaj(String str, int i, enip enipVar) {
        this.g = new dpai(dpaf.a, enipVar);
        this.e = enipVar;
    }

    public static dpaj[] values() {
        return (dpaj[]) f.clone();
    }

    @Override // defpackage.dpae
    public final String[] a(dpad dpadVar) {
        dpadVar.getClass();
        return this.g.a(dpadVar);
    }
}
