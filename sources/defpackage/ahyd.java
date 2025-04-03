package defpackage;

import com.google.android.apps.messaging.multishare.chip.ChipData;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahyd extends ffhv implements ffjm {
    int a;
    /* synthetic */ Object b;
    final /* synthetic */ ahyk c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahyd(ahyk ahykVar, ffgu ffguVar) {
        super(2, ffguVar);
        this.c = ahykVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((ahyd) c((ChipData) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ChipData chipData = (ChipData) this.b;
        ahyk ahykVar = this.c;
        this.a = 1;
        Object b = ahykVar.b(chipData, this);
        return b == ffhhVar ? ffhhVar : b;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        ahyd ahydVar = new ahyd(this.c, ffguVar);
        ahydVar.b = obj;
        return ahydVar;
    }
}
