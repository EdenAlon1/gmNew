package defpackage;

import com.android.vcard.VCardConfig;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cshu implements cshn {
    private final axkm a;
    private final axmm b;
    private final asiv c;
    private final axcn d;

    public cshu(axkm axkmVar, axmm axmmVar, asiv asivVar, axcn axcnVar) {
        this.a = axkmVar;
        this.b = axmmVar;
        this.c = asivVar;
        this.d = axcnVar;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [comc, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [comc, java.lang.Object] */
    @Override // defpackage.cshn
    public final void a() {
        this.a.Z(false);
        if (csgj.a() && ((Boolean) ((cfup) csfu.l.get()).e()).booleanValue()) {
            this.a.T(axeu.DISABLING, false);
            this.b.f(false);
        } else {
            this.a.S(axeu.DISABLING);
            this.b.e();
        }
        this.a.G();
        this.a.R();
        this.a.H();
        this.a.ai(false);
        axkm axkmVar = this.a;
        efbd.b();
        axkmVar.e.get().m(new emwl() { // from class: axfb
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                axep builder = ((axez) obj).toBuilder();
                builder.copyOnWrite();
                axez axezVar = (axez) builder.instance;
                axezVar.b &= -2097153;
                axezVar.x = false;
                return builder.build();
            }
        });
        axkmVar.N();
        axkm axkmVar2 = this.a;
        efbd.b();
        axkmVar2.e.get().m(new emwl() { // from class: axiv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                cskc cskcVar = axkm.a;
                axep builder = ((axez) obj).toBuilder();
                axey axeyVar = ((axez) builder.instance).z;
                if (axeyVar == null) {
                    axeyVar = axey.a;
                }
                axex axexVar = (axex) axeyVar.toBuilder();
                axexVar.copyOnWrite();
                axey axeyVar2 = (axey) axexVar.instance;
                axeyVar2.b &= -2;
                axeyVar2.c = 0L;
                axey axeyVar3 = (axey) axexVar.build();
                builder.copyOnWrite();
                axez axezVar = (axez) builder.instance;
                axeyVar3.getClass();
                axezVar.z = axeyVar3;
                axezVar.b |= VCardConfig.FLAG_CONVERT_PHONETIC_NAME_STRINGS;
                return builder.build();
            }
        });
        axkmVar2.N();
        if (this.c.a()) {
            this.a.Q();
        }
        this.d.a();
    }
}
