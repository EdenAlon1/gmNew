package defpackage;

import j$.util.Collection;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import j$.util.stream.Stream;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Supplier;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtvn {
    public final dtyq a;
    public final dtry b;
    public final dtry c;
    public final String d;
    public final String e;
    public final boolean f;
    public final duap g;
    public int h;
    public final int i;

    public dtvn(dtyq dtyqVar, dtry dtryVar, dtry dtryVar2, String str, duap duapVar, int i, boolean z, String str2) {
        this.a = dtyqVar;
        if (!z && dtryVar != null && !((dtqt) dtryVar.a).f) {
            throw new IllegalArgumentException(a.b(dtryVar, "join on ", " without index"));
        }
        this.b = dtryVar;
        this.c = dtryVar2;
        this.d = str;
        this.g = duapVar;
        this.i = i;
        this.e = str2;
        boolean z2 = true;
        if (dtryVar != null) {
            dtry c = dtryVar.c();
            if (dtryVar.h() || (c != null && c.h())) {
                z2 = false;
            }
        }
        this.f = z2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(dtve dtveVar, dtsr dtsrVar, dtvs dtvsVar, boolean z) {
        Stream stream = Collection.EL.stream(enkr.c(dtsrVar.f));
        Function function = z ? new Function() { // from class: dtvk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String str = (String) obj;
                if (!str.startsWith("group_concat(quote(")) {
                    return str;
                }
                String substring = str.substring(19);
                return substring.substring(0, substring.indexOf("), '|')"));
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        } : new Function() { // from class: dtvl
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return (String) obj;
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        dtyq dtyqVar = this.a;
        String str = this.e;
        ArrayList arrayList = (ArrayList) stream.map(function).collect(Collectors.toCollection(new Supplier() { // from class: dtvm
            @Override // java.util.function.Supplier
            public final Object get() {
                return new ArrayList();
            }
        }));
        dtsrVar.h.put(str, dtyqVar.a(dtveVar, dtsrVar, (String[]) arrayList.toArray(new String[0]), null, dtvsVar.b(this.e), dtvsVar));
        engw c = this.a.m.c();
        int i = ((enou) c).c;
        for (int i2 = 0; i2 < i; i2++) {
            ((dtvn) c.get(i2)).a(dtveVar, dtsrVar, dtvsVar, z);
        }
    }
}
