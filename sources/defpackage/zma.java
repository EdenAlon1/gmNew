package defpackage;

import com.google.android.apps.messaging.shared.api.messaging.MessageId;
import j$.time.Instant;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class zma extends ffhv implements ffjn {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ zmw c;
    private /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zma(ffgu ffguVar, zmw zmwVar) {
        super(3, ffguVar);
        this.c = zmwVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        zma zmaVar = new zma((ffgu) obj3, this.c);
        zmaVar.d = (ffxy) obj;
        zmaVar.b = (Object[]) obj2;
        return zmaVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [ffxy, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            ?? r2 = this.d;
            Object obj2 = this.b;
            ekzz f = eleg.f("PagedMessageListUiAdapterImpl#messageFlow");
            try {
                Object obj3 = ((Object[]) obj2)[0];
                obj3.getClass();
                Object obj4 = ((Object[]) obj2)[1];
                obj4.getClass();
                cbnd cbndVar = (cbnd) ((Object[]) obj2)[2];
                ablm ablmVar = (ablm) ((Object[]) obj2)[3];
                Object obj5 = ((Object[]) obj2)[4];
                obj5.getClass();
                Object obj6 = ((Object[]) obj2)[5];
                obj6.getClass();
                int intValue = ((Integer) obj6).intValue();
                MessageId messageId = (MessageId) ((Object[]) obj2)[6];
                Object obj7 = ((Object[]) obj2)[7];
                obj7.getClass();
                boolean booleanValue = ((Boolean) obj7).booleanValue();
                Object obj8 = ((Object[]) obj2)[8];
                obj8.getClass();
                boolean booleanValue2 = ((Boolean) obj8).booleanValue();
                Object obj9 = ((Object[]) obj2)[9];
                obj9.getClass();
                zlh zlhVar = new zlh((aaud) obj3, (aaxe) obj4, cbndVar, ablmVar, (zkm) obj5, intValue, messageId, booleanValue, booleanValue2, ((Boolean) obj9).booleanValue(), (Instant) ((Object[]) obj2)[10]);
                aaud aaudVar = zlhVar.a;
                aaxe aaxeVar = zlhVar.b;
                cbnd cbndVar2 = zlhVar.c;
                ablm ablmVar2 = zlhVar.d;
                zkm zkmVar = zlhVar.e;
                int i2 = zlhVar.f;
                MessageId messageId2 = zlhVar.g;
                boolean z = zlhVar.h;
                boolean z2 = zlhVar.i;
                boolean z3 = zlhVar.j;
                Instant instant = zlhVar.k;
                zkt zktVar = this.c.r;
                zktVar.a.clear();
                zktVar.b.clear();
                ffkx ffkxVar = new ffkx();
                ffkxVar.a = true;
                ojf a = ojz.a(aaudVar.b, new zls(this.c, ffkxVar, zkmVar, aaxeVar, ablmVar2, z2, z3, i2, instant, z, messageId2, aaudVar.a, cbndVar2, null));
                ffig.a(f, null);
                this.a = 1;
                if (r2.fQ(a, this) == ffhhVar) {
                    return ffhhVar;
                }
            } finally {
            }
        }
        return ffcu.a;
    }
}
