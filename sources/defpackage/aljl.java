package defpackage;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aljl implements fbba {
    public static ecpj a(fazb fazbVar) {
        engw engwVar;
        int i;
        ecpg ecpgVar = new ecpg();
        ecpgVar.g = 1;
        ecpgVar.b(250);
        ecpgVar.a(250);
        ecpgVar.c(250);
        ecpgVar.d(10000);
        ecpgVar.e(engw.t(1000, 2500, 5000));
        ecpgVar.g = true != ((Boolean) alsc.c.e()).booleanValue() ? 2 : 3;
        ecpgVar.b(((Integer) alsc.d.e()).intValue());
        ecpgVar.a(((Integer) alsc.e.e()).intValue());
        ecpgVar.c(((Integer) alsc.f.e()).intValue());
        ecpgVar.e(((ezgu) alsc.g.e()).b);
        ecpgVar.d(((Integer) alsc.h.e()).intValue());
        if (ecpgVar.f == 15 && (engwVar = ecpgVar.e) != null && (i = ecpgVar.g) != 0) {
            return new ecph(ecpgVar.a, ecpgVar.b, ecpgVar.c, ecpgVar.d, engwVar, i);
        }
        StringBuilder sb = new StringBuilder();
        if ((1 & ecpgVar.f) == 0) {
            sb.append(" initialMonitoringDelayMs");
        }
        if ((ecpgVar.f & 2) == 0) {
            sb.append(" checkForResponseIntervalMs");
        }
        if ((ecpgVar.f & 4) == 0) {
            sb.append(" midStallCheckForResponseIntervalMs");
        }
        if ((ecpgVar.f & 8) == 0) {
            sb.append(" postToMainIntervalMs");
        }
        if (ecpgVar.e == null) {
            sb.append(" stallThresholdsMs");
        }
        if (ecpgVar.g == 0) {
            sb.append(" enablement");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    @Override // defpackage.ffbr, defpackage.ffbq
    public final /* bridge */ /* synthetic */ Object b() {
        throw null;
    }
}
