package defpackage;

import android.util.ArrayMap;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class azq implements bev {
    public bad a;
    private final bev b;

    public azq(bev bevVar) {
        this.b = bevVar;
    }

    private final avr k(avr avrVar) {
        bgw bgwVar;
        if (avrVar == null) {
            return null;
        }
        bad badVar = this.a;
        if (badVar == null) {
            bgwVar = bgw.a;
        } else {
            Pair pair = new Pair(badVar.h, badVar.i.get(0));
            bgw bgwVar2 = bgw.a;
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put((String) pair.first, pair.second);
            bgwVar = new bgw(arrayMap);
        }
        this.a = null;
        return new awu(avrVar, new Size(avrVar.c(), avrVar.b()), new bku(new bpm(null, bgwVar, avrVar.e().a())));
    }

    @Override // defpackage.bev
    public final int a() {
        return this.b.a();
    }

    @Override // defpackage.bev
    public final int b() {
        return this.b.b();
    }

    @Override // defpackage.bev
    public final int c() {
        return this.b.c();
    }

    @Override // defpackage.bev
    public final int d() {
        return this.b.d();
    }

    @Override // defpackage.bev
    public final Surface e() {
        return this.b.e();
    }

    @Override // defpackage.bev
    public final avr f() {
        return k(this.b.f());
    }

    @Override // defpackage.bev
    public final avr g() {
        return k(this.b.g());
    }

    @Override // defpackage.bev
    public final void h() {
        this.b.h();
    }

    @Override // defpackage.bev
    public final void i() {
        this.b.i();
    }

    @Override // defpackage.bev
    public final void j(final beu beuVar, Executor executor) {
        this.b.j(new beu() { // from class: azp
            @Override // defpackage.beu
            public final void a(bev bevVar) {
                beuVar.a(azq.this);
            }
        }, executor);
    }
}
