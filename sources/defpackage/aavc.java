package defpackage;

import com.google.android.apps.messaging.R;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class aavc extends ffhv implements ffjo {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    /* synthetic */ boolean c;
    final /* synthetic */ aavd d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aavc(aavd aavdVar, ffgu ffguVar) {
        super(4, ffguVar);
        this.d = aavdVar;
    }

    @Override // defpackage.ffjo
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean booleanValue = ((Boolean) obj3).booleanValue();
        aavc aavcVar = new aavc(this.d, (ffgu) obj4);
        aavcVar.a = (engw) obj;
        aavcVar.b = (alxj) obj2;
        aavcVar.c = booleanValue;
        return aavcVar.b(ffcu.a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Iterable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [alxj, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        ?? r1 = this.a;
        ?? r2 = this.b;
        boolean z = this.c;
        ArrayList arrayList = new ArrayList(ffdx.n(r1, 10));
        for (alyv alyvVar : r1) {
            aavd aavdVar = this.d;
            zvu a = aavdVar.f.a(alyvVar, null, null);
            alxi b = r2.b();
            alxi alxiVar = alxi.GROUP;
            arrayList.add(new aavf(aavdVar.d.a(new zst(a, b == alxiVar, r2.g(), null, null, false, false, false, false, false, null, false, false, false, false, false, false, 2096568)), alyvVar.b(), z, aavdVar.e.b));
        }
        String string = this.d.a.getString(R.string.scheduled_messages_list_button_text, new Integer(((engw) r1).size()));
        string.getClass();
        return new aave(arrayList, new dmxz(string, z, new aavb(this.d)));
    }
}
