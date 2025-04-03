package defpackage;

import android.content.Intent;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class acss extends ffhv implements ffjm {
    int a;
    final /* synthetic */ acsu b;
    final /* synthetic */ Intent c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acss(ffgu ffguVar, acsu acsuVar, Intent intent) {
        super(2, ffguVar);
        this.b = acsuVar;
        this.c = intent;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((acss) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        try {
            if (this.a != 0) {
                ffci.b(obj);
            } else {
                ffci.b(obj);
                ffsk ffskVar = (ffsk) this.d;
                acsu acsuVar = this.b;
                Intent intent = this.c;
                this.d = ffskVar;
                this.a = 1;
                obj = acsuVar.a(intent, this);
                if (obj == ffhhVar) {
                    return ffhhVar;
                }
            }
            esmb esmbVar = (esmb) obj;
            if (esmbVar == null) {
                acsu.b.r("Draft message request is empty");
                return null;
            }
            acsu acsuVar2 = this.b;
            esni esniVar = (esni) esnk.a.createBuilder();
            esniVar.copyOnWrite();
            esnk esnkVar = (esnk) esniVar.instance;
            esnkVar.c = esmbVar;
            esnkVar.b = 212;
            eyfy build = esniVar.build();
            build.getClass();
            acsuVar2.b((esnk) build);
            return null;
        } catch (acsb unused) {
            acsu acsuVar3 = this.b;
            esni esniVar2 = (esni) esnk.a.createBuilder();
            esno esnoVar = (esno) esnp.a.createBuilder();
            esnoVar.copyOnWrite();
            ((esnp) esnoVar.instance).b = 1;
            esniVar2.copyOnWrite();
            esnk esnkVar2 = (esnk) esniVar2.instance;
            esnp esnpVar = (esnp) esnoVar.build();
            esnpVar.getClass();
            esnkVar2.c = esnpVar;
            esnkVar2.b = 213;
            eyfy build2 = esniVar2.build();
            build2.getClass();
            acsuVar3.b((esnk) build2);
            return null;
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        acss acssVar = new acss(ffguVar, this.b, this.c);
        acssVar.d = obj;
        return acssVar;
    }
}
