package defpackage;

import android.text.TextUtils;
import j$.util.function.Function$CC;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cekw implements cctm {
    private final crty a;
    private final cclj b;
    private final axmm c;

    public cekw(crty crtyVar, cclj ccljVar, axmm axmmVar) {
        this.a = crtyVar;
        this.b = ccljVar;
        this.c = axmmVar;
    }

    @Override // defpackage.cctm
    public final axew a() {
        return axew.ENCRYPTION_KEYS;
    }

    @Override // defpackage.cctm
    public final bqkx b() {
        return bqkx.ENCRYPTION_KEY_OBJECT;
    }

    @Override // defpackage.cctm
    public final ccdx c() {
        return this.b;
    }

    @Override // defpackage.cctm
    public final elfl d(String str) {
        return TextUtils.isEmpty(str) ? this.a.F() : this.a.G(str);
    }

    @Override // defpackage.cctm
    public final elfl e(pot potVar) {
        final axmi axmiVar = axmi.RESTORE;
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        Function function = new Function() { // from class: axgj
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                axep axepVar = (axep) obj;
                cskc cskcVar = axkm.a;
                axmi b = axmi.b(((axez) axepVar.instance).f);
                if (b == null) {
                    b = axmi.INITIAL_SYNC_STATUS_NOT_SET;
                }
                axmi axmiVar2 = axmi.this;
                if (b.equals(axmi.RESTORE) && axmiVar2.equals(axmi.BACKUP)) {
                    atomicBoolean.set(true);
                }
                axepVar.copyOnWrite();
                axez axezVar = (axez) axepVar.instance;
                axezVar.f = axmiVar2.j;
                axezVar.b |= 4;
                return axepVar;
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        };
        final axkm axkmVar = this.c.a;
        return axkmVar.B(function, new Function() { // from class: axgk
            @Override // java.util.function.Function
            /* renamed from: andThen */
            public final /* synthetic */ Function mo448andThen(Function function2) {
                return Function$CC.$default$andThen(this, function2);
            }

            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                axkm axkmVar2 = axkm.this;
                axkmVar2.M();
                if (!atomicBoolean.get()) {
                    return null;
                }
                axkmVar2.O();
                return null;
            }

            public final /* synthetic */ Function compose(Function function2) {
                return Function$CC.$default$compose(this, function2);
            }
        });
    }

    @Override // defpackage.cctm
    public final epfx f() {
        return epfx.RESTORE_ENCRYPTION_KEY;
    }

    @Override // defpackage.cctm
    public final /* synthetic */ String g(Object obj) {
        return ((eszz) obj).c;
    }

    @Override // defpackage.cctm
    public final String h() {
        return "Encryption Keys";
    }
}
