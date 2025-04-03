package defpackage;

import android.content.ContentValues;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dtxf extends duaw {
    private final duap[] a;

    public dtxf(duav... duavVarArr) {
        int length = duavVarArr.length;
        this.a = new duap[length];
        int i = 0;
        int i2 = 0;
        while (i < length) {
            this.a[i2] = duavVarArr[i].a();
            i++;
            i2++;
        }
    }

    @Override // defpackage.duaw
    public final void a(final dtzu dtzuVar, StringBuilder sb, final List list) {
        sb.append("(");
        sb.append((String) DesugarArrays.stream(this.a).map(new Function() { // from class: dtxd
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((duap) obj).b(dtzu.this, list);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(" OR ")));
        sb.append(")");
    }

    @Override // defpackage.duaw
    public final void b(final dtzu dtzuVar, StringBuilder sb) {
        sb.append("(");
        sb.append((String) DesugarArrays.stream(this.a).map(new Function() { // from class: dtxe
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((duap) obj).a(dtzu.this);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        }).collect(Collectors.joining(" OR ")));
        sb.append(")");
    }

    @Override // defpackage.duaw
    protected final boolean c(dtyl dtylVar, duaw duawVar) {
        int i = 0;
        while (true) {
            duap[] duapVarArr = this.a;
            if (i >= duapVarArr.length) {
                return true;
            }
            if (!duapVarArr[i].d(dtylVar, duawVar)) {
                return false;
            }
            i++;
        }
    }

    @Override // defpackage.duaw
    protected final boolean d(String str, ContentValues contentValues) {
        int i = 0;
        while (true) {
            duap[] duapVarArr = this.a;
            if (i >= duapVarArr.length) {
                return true;
            }
            if (!duapVarArr[i].e(str, contentValues)) {
                return false;
            }
            i++;
        }
    }

    @Override // defpackage.duaw
    public final void e(dtse dtseVar) {
        int i = 0;
        while (true) {
            duap[] duapVarArr = this.a;
            if (i >= duapVarArr.length) {
                return;
            }
            duapVarArr[i].c(dtseVar);
            i++;
        }
    }
}
