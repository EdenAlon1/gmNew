package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cvnt {
    private final ffbr a;
    private final ffbr b;

    public cvnt(ffbr ffbrVar, ffbr ffbrVar2) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
    }

    public final void a(String str, bcse bcseVar) {
        bcseVar.getClass();
        if (str.length() <= 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        String b = cglt.b(str);
        cuks cuksVar = (cuks) this.b.b();
        MessageIdType u = bcseVar.u();
        u.getClass();
        b.getClass();
        cuksVar.a(u, b);
        if (cvns.b(bcseVar)) {
            cvnq cvnqVar = (cvnq) cvnr.a.createBuilder();
            long j = bcseVar.t().a;
            cvnqVar.copyOnWrite();
            ((cvnr) cvnqVar.instance).c = j;
            cvnqVar.copyOnWrite();
            ((cvnr) cvnqVar.instance).b = b;
            String I = bcseVar.I();
            if (I == null) {
                I = "";
            }
            cvnqVar.copyOnWrite();
            ((cvnr) cvnqVar.instance).d = I;
            boolean aS = bcseVar.aS();
            cvnqVar.copyOnWrite();
            ((cvnr) cvnqVar.instance).e = aS;
            cvnr cvnrVar = (cvnr) cvnqVar.build();
            cvnk cvnkVar = new cvnk();
            fbae.e(cvnkVar);
            ekku.a(cvnkVar, cvnrVar);
            cvnkVar.t(((eg) this.a.b()).a(), null);
        }
    }
}
