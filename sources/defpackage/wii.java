package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.BugleConversationId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wii implements whk {
    public final Context a;
    public final ffsk b;
    public final ffbr c;
    public final ffbr d;
    public final ffbr e;
    public final ffbr f;
    public final ffbr g;
    public final ffbr h;
    public final ffbr i;
    public final ffbr j;
    public final elbx k;
    public SharedPreferences.OnSharedPreferenceChangeListener l;
    private final ffbr m;
    private final ffbr n;
    private final ffbr o;
    private final ffbr p;
    private final ffxx q;
    private final ffxx r;
    private final fgdj s;

    public wii(Context context, ffsk ffskVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12, elbx elbxVar) {
        List arrayList;
        context.getClass();
        ffskVar.getClass();
        ffbrVar7.getClass();
        ffbrVar9.getClass();
        elbxVar.getClass();
        this.a = context;
        this.b = ffskVar;
        this.c = ffbrVar;
        this.d = ffbrVar2;
        this.m = ffbrVar3;
        this.n = ffbrVar4;
        this.o = ffbrVar5;
        this.e = ffbrVar6;
        this.f = ffbrVar7;
        this.g = ffbrVar8;
        this.h = ffbrVar9;
        this.i = ffbrVar10;
        this.j = ffbrVar11;
        this.p = ffbrVar12;
        this.k = elbxVar;
        Object b = ffbrVar12.b();
        b.getClass();
        Optional optional = (Optional) b;
        if (((Boolean) ctjd.bd.e()).booleanValue() || ((Boolean) ctjd.bg.e()).booleanValue()) {
            arrayList = new ArrayList();
            if (((Boolean) ctjd.bd.e()).booleanValue()) {
                arrayList.add(Integer.valueOf((int) ((Number) ctjd.be.e()).longValue()));
            }
            if (((Boolean) ctjd.bg.e()).booleanValue()) {
                arrayList.add(Integer.valueOf((int) ((Number) ctjd.bh.e()).longValue()));
            }
        } else {
            arrayList = ffel.a;
        }
        ffxx a = ffyy.a(new fgcp(new wij(optional, arrayList, null)));
        int i = fgcz.a;
        fgdj b2 = fgbn.b(a, ffskVar, fgcy.b, null);
        this.q = b2;
        fgdj b3 = fgbn.b(ffyy.a(new ffxn(new wih(this, null))), ffskVar, fgcy.b, null);
        this.r = b3;
        this.s = fgbn.b(ffyy.a(new fgbt(new fgch(b2, b3, new why(this, null)), new wib(this, null))), ffskVar, fgcy.b, false);
    }

    @Override // defpackage.whk
    public final fgdj a() {
        return this.s;
    }

    @Override // defpackage.whk
    public final void b() {
        if (!ctjd.c() || ((Optional) this.m.b()).isEmpty() || ((Optional) this.n.b()).isEmpty() || ((Optional) this.o.b()).isEmpty()) {
            return;
        }
        Optional optional = (Optional) this.g.b();
        final ffji ffjiVar = new ffji() { // from class: whl
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                wmu wmuVar = (wmu) obj;
                wmuVar.getClass();
                wmuVar.g();
                return ffcu.a;
            }
        };
        optional.ifPresent(new Consumer() { // from class: whp
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ffji.this.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        ((wnn) ((Optional) this.o.b()).get()).a(new ffix() { // from class: whq
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        });
        ((wiw) ((Optional) this.m.b()).get()).a(new wic(this));
    }

    @Override // defpackage.whk
    public final void c() {
        if (!ctjd.c() || ((Optional) this.e.b()).isEmpty() || ((Optional) this.o.b()).isEmpty() || ((Optional) this.m.b()).isEmpty()) {
            return;
        }
        Optional optional = (Optional) this.j.b();
        final ffji ffjiVar = new ffji() { // from class: whw
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                wmf wmfVar = (wmf) obj;
                wmfVar.getClass();
                wmfVar.i();
                return ffcu.a;
            }
        };
        optional.ifPresent(new Consumer() { // from class: whx
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ffji.this.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        Optional optional2 = (Optional) this.g.b();
        final ffji ffjiVar2 = new ffji() { // from class: whm
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                wmu wmuVar = (wmu) obj;
                wmuVar.getClass();
                wmuVar.l();
                return ffcu.a;
            }
        };
        optional2.ifPresent(new Consumer() { // from class: whn
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ffji.this.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
        final wic wicVar = new wic(this);
        ((wiw) ((Optional) this.m.b()).get()).c(wicVar);
        ((wnn) ((Optional) this.o.b()).get()).a(new ffix() { // from class: who
            @Override // defpackage.ffix
            public final Object invoke() {
                wii wiiVar = wii.this;
                czrq czrqVar = (czrq) ((Optional) wiiVar.e.b()).get();
                Object b = wiiVar.f.b();
                b.getClass();
                ConversationIdType conversationIdType = ((BugleConversationId) b).a;
                final wgx wgxVar = wicVar;
                czrqVar.a(conversationIdType, new ffji() { // from class: whr
                    @Override // defpackage.ffji
                    public final Object invoke(Object obj) {
                        wgx wgxVar2 = wgx.this;
                        wgxVar2.c((String) obj);
                        wgxVar2.b();
                        return ffcu.a;
                    }
                });
                return ffcu.a;
            }
        });
    }

    @Override // defpackage.abqq, java.lang.AutoCloseable
    public final void close() {
        Optional optional = (Optional) this.g.b();
        final ffji ffjiVar = new ffji() { // from class: whs
            @Override // defpackage.ffji
            public final Object invoke(Object obj) {
                wmu wmuVar = (wmu) obj;
                wmuVar.getClass();
                wmuVar.i();
                return ffcu.a;
            }
        };
        optional.ifPresent(new Consumer() { // from class: wht
            @Override // java.util.function.Consumer
            public final void accept(Object obj) {
                ffji.this.invoke(obj);
            }

            public final /* synthetic */ Consumer andThen(Consumer consumer) {
                return Consumer$CC.$default$andThen(this, consumer);
            }
        });
    }
}
