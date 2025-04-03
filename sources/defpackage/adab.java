package defpackage;

import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class adab extends ffhv implements ffjn {
    int a;
    final /* synthetic */ adaj b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public adab(adaj adajVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.b = adajVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        adab adabVar = new adab(this.b, (ffgu) obj3);
        adabVar.c = (aczz) obj;
        return adabVar.b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        Object obj2 = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i == 0) {
            Object obj3 = this.c;
            adaj adajVar = this.b;
            aczz aczzVar = (aczz) obj3;
            MessageIdType b = bdhb.b(aczzVar.b);
            String str = aczzVar.c;
            str.getClass();
            this.a = 1;
            Object a = ffra.a(ekxi.a(adajVar.b), new adaf(null, adajVar, b, str), this);
            if (a != ffhh.a) {
                a = ffcu.a;
            }
            if (a == obj2) {
                return obj2;
            }
        }
        return ceyt.i();
    }
}
