package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Stream;
import java.util.Iterator;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class aljq {
    private final Context a;
    private final csjk b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;

    public aljq(Context context, csjk csjkVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3) {
        this.a = context;
        this.b = csjkVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.e = ffbrVar3;
    }

    public final eohu a(int i) {
        eohu eohuVar = (eohu) eohv.b.createBuilder();
        boolean C = ((ctwb) this.d.b()).h(i).C();
        eohuVar.copyOnWrite();
        eohv eohvVar = (eohv) eohuVar.instance;
        int i2 = 4;
        eohvVar.c |= 4;
        eohvVar.f = C;
        eplj A = ((csmz) this.b.a()).A();
        eohuVar.copyOnWrite();
        eohv eohvVar2 = (eohv) eohuVar.instance;
        eohvVar2.g = A.g;
        int i3 = 8;
        eohvVar2.c |= 8;
        boolean E = ((ctvb) ((cpaw) this.c.b()).a.b()).E();
        eohuVar.copyOnWrite();
        eohv eohvVar3 = (eohv) eohuVar.instance;
        eohvVar3.c |= 16;
        eohvVar3.h = E;
        boolean B = ((ctwb) ((cpaw) this.c.b()).b.b()).h(i).B();
        eohuVar.copyOnWrite();
        eohv eohvVar4 = (eohv) eohuVar.instance;
        eohvVar4.c |= 32;
        eohvVar4.i = B;
        if (((asxi) this.e.b()).a()) {
            boolean p = ((csmz) this.b.a()).p();
            eohuVar.copyOnWrite();
            eohv eohvVar5 = (eohv) eohuVar.instance;
            eohvVar5.c |= 64;
            eohvVar5.k = p;
        }
        enip h = ((csmz) this.b.a()).h();
        final aljp aljpVar = new aljp();
        Stream map = Collection.EL.stream(h).map(new Function() { // from class: aljn
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (eohr) aljp.this.fP((csmy) obj);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
        int i4 = engw.d;
        Iterable iterable = (Iterable) map.collect(endq.a);
        eohuVar.copyOnWrite();
        eohv eohvVar6 = (eohv) eohuVar.instance;
        eygi eygiVar = eohvVar6.j;
        if (!eygiVar.c()) {
            eohvVar6.j = eyfy.mutableCopy(eygiVar);
        }
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            eohvVar6.j.h(((eohr) it.next()).g);
        }
        NetworkInfo activeNetworkInfo = ((ConnectivityManager) this.a.getSystemService("connectivity")).getActiveNetworkInfo();
        if (activeNetworkInfo == null) {
            eohuVar.copyOnWrite();
            eohv eohvVar7 = (eohv) eohuVar.instance;
            eohvVar7.e = 6;
            eohvVar7.c |= 2;
            eohuVar.copyOnWrite();
            eohv eohvVar8 = (eohv) eohuVar.instance;
            eohvVar8.d = 0;
            eohvVar8.c |= 1;
            return eohuVar;
        }
        switch (aljo.a[activeNetworkInfo.getDetailedState().ordinal()]) {
            case 1:
                i3 = 2;
                break;
            case 2:
                i3 = 3;
                break;
            case 3:
                i3 = 4;
                break;
            case 4:
                i3 = 5;
                break;
            case 5:
                i3 = 6;
                break;
            case 6:
                i3 = 7;
                break;
            case 7:
                break;
            case 8:
                i3 = 9;
                break;
            case 9:
                i3 = 10;
                break;
            case 10:
                i3 = 11;
                break;
            case 11:
                i3 = 12;
                break;
            case 12:
                i3 = 13;
                break;
            case 13:
                i3 = 14;
                break;
            default:
                i3 = 1;
                break;
        }
        eohuVar.copyOnWrite();
        eohv eohvVar9 = (eohv) eohuVar.instance;
        eohvVar9.e = i3 - 1;
        eohvVar9.c |= 2;
        int type = activeNetworkInfo.getType();
        if (type == 0) {
            i2 = 2;
        } else if (type == 1) {
            i2 = 3;
        } else if (type != 6) {
            i2 = 5;
        }
        eohuVar.copyOnWrite();
        eohv eohvVar10 = (eohv) eohuVar.instance;
        eohvVar10.d = i2 - 1;
        eohvVar10.c |= 1;
        return eohuVar;
    }

    public final eohv b(int i) {
        return (eohv) a(i).build();
    }
}
