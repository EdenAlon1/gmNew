package defpackage;

import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.multishare.chip.ChipData;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ahvf extends ffhv implements ffjn {
    /* synthetic */ Object a;
    /* synthetic */ Object b;
    final /* synthetic */ ahvg c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ahvf(ahvg ahvgVar, ffgu ffguVar) {
        super(3, ffguVar);
        this.c = ahvgVar;
    }

    @Override // defpackage.ffjn
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2, Object obj3) {
        ahvf ahvfVar = new ahvf(this.c, (ffgu) obj3);
        ahvfVar.a = (amar) obj;
        ahvfVar.b = (ahut) obj2;
        return ahvfVar.b(ffcu.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [amar, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [ahut, java.lang.Object] */
    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        List list;
        ffci.b(obj);
        final ?? r1 = this.a;
        ?? r2 = this.b;
        if (r1 != 0) {
            final ahvg ahvgVar = this.c;
            engw b = r1.b();
            list = new ArrayList(ffdx.n(b, 10));
            enqv it = b.iterator();
            while (it.hasNext()) {
                final ambh ambhVar = (ambh) it.next();
                list.add(new dnem(ambhVar.a() + " " + ambhVar.b, null, null, r2.f(ambhVar.a), false, new ffix() { // from class: ahvd
                    @Override // defpackage.ffix
                    public final Object invoke() {
                        ChipData b2 = ahus.b(r1, ambhVar.a);
                        ahvg ahvgVar2 = ahvg.this;
                        ahvgVar2.b.c(b2);
                        ahvgVar2.c();
                        return ffcu.a;
                    }
                }, null, 0, 214));
            }
        } else {
            list = ffel.a;
        }
        String string = this.c.a.getString(R.string.picker_disambiguation_title);
        string.getClass();
        return new dmvi(string, list, null, null, null, null, new ahve(this.c), 60);
    }
}
