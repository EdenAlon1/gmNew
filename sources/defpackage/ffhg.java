package defpackage;

import java.util.Objects;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class ffhg implements ffgu, ffhs {
    private static final AtomicReferenceFieldUpdater a = AtomicReferenceFieldUpdater.newUpdater(ffhg.class, Object.class, "result");
    private final ffgu b;
    private volatile Object result;

    public ffhg(ffgu ffguVar, Object obj) {
        this.b = ffguVar;
        this.result = obj;
    }

    public final Object a() {
        Object obj = this.result;
        ffhh ffhhVar = ffhh.b;
        if (obj == ffhhVar) {
            if (ffhf.a(a, this, ffhhVar, ffhh.a)) {
                return ffhh.a;
            }
            obj = this.result;
        }
        if (obj == ffhh.c) {
            return ffhh.a;
        }
        if (obj instanceof ffcg) {
            throw ((ffcg) obj).a;
        }
        return obj;
    }

    @Override // defpackage.ffhs
    public final ffhs dI() {
        ffgu ffguVar = this.b;
        if (ffguVar instanceof ffhs) {
            return (ffhs) ffguVar;
        }
        return null;
    }

    public final String toString() {
        ffgu ffguVar = this.b;
        Objects.toString(ffguVar);
        return "SafeContinuation for ".concat(ffguVar.toString());
    }

    @Override // defpackage.ffgu
    public final ffhd u() {
        return this.b.u();
    }

    @Override // defpackage.ffgu
    public final void w(Object obj) {
        while (true) {
            Object obj2 = this.result;
            ffhh ffhhVar = ffhh.b;
            if (obj2 != ffhhVar) {
                ffhh ffhhVar2 = ffhh.a;
                if (obj2 != ffhhVar2) {
                    throw new IllegalStateException("Already resumed");
                }
                if (ffhf.a(a, this, ffhhVar2, ffhh.c)) {
                    this.b.w(obj);
                    return;
                }
            } else if (ffhf.a(a, this, ffhhVar, obj)) {
                return;
            }
        }
    }

    public ffhg(ffgu ffguVar) {
        this(ffguVar, ffhh.b);
    }

    @Override // defpackage.ffhs
    public final void dJ() {
    }
}
