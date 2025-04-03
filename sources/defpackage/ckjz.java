package defpackage;

import com.google.android.ims.rcsservice.group.GroupInfo;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes8.dex */
public abstract class ckjz {
    public static final entd w = entd.c("BugleGroupManagement");

    public static ckjy w() {
        ckhq ckhqVar = new ckhq();
        ckhqVar.v(0);
        ckhqVar.d = new cpxu();
        ckhqVar.o(false);
        ckhqVar.e = 1;
        ckhqVar.B(false);
        ckhqVar.i(amer.a);
        return ckhqVar;
    }

    static Optional x(ckjz ckjzVar) {
        ckhr ckhrVar = (ckhr) ckjzVar;
        return ckhrVar.f.isPresent() ? ckhrVar.f : ckhrVar.e.flatMap(new Function() { // from class: ckjv
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function) {
                return Function$CC.$default$andThen(this, function);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                entd entdVar = ckjz.w;
                return Optional.ofNullable(((GroupInfo) obj).c);
            }

            public final /* synthetic */ Function compose(Function function) {
                return Function$CC.$default$compose(this, function);
            }
        });
    }

    public abstract int a();

    public abstract amer b();

    public abstract cpxu c();

    public abstract Optional d();

    public abstract Optional e();

    public abstract Optional f();

    public abstract Optional g();

    public abstract Optional h();

    public abstract Optional i();

    public abstract Optional j();

    public abstract Optional k();

    public abstract Optional l();

    public abstract Optional m();

    public abstract Optional n();

    public abstract Optional o();

    public abstract Optional p();

    public abstract boolean q();

    public abstract boolean r();

    public abstract boolean s();

    public abstract boolean t();

    @Deprecated
    public abstract boolean u();

    public abstract int v();
}
