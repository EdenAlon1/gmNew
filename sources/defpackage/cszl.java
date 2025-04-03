package defpackage;

import android.content.Context;
import com.google.common.util.concurrent.ListenableFuture;
import com.google.firebase.iid.FirebaseInstanceId;
import j$.util.Objects;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class cszl {
    public final ffbr a;
    public final Context b;
    public final cqoh c;
    public final dfpi e;
    public final ctyx f;
    public final errl g;
    public final ejlc i;
    private final ejlc j;
    public final Random d = new Random();
    public final emyl h = emys.a(new emyl() { // from class: cszh
        @Override // defpackage.emyl
        public final Object get() {
            cszl cszlVar = cszl.this;
            FirebaseInstanceId b = FirebaseInstanceId.b();
            FirebaseInstanceId.k(b.d);
            if (b.q(b.c())) {
                b.n();
            }
            String f = b.f();
            long days = TimeUnit.MILLISECONDS.toDays(cszlVar.c.f().toEpochMilli() + TimeUnit.HOURS.toMillis(Objects.hashCode(f) % (((Integer) cszt.p.e()).intValue() * 24)));
            cszlVar.d.setSeed(Objects.hash(f, Long.valueOf(days), cszlVar.b.getPackageName()));
            return Integer.valueOf(cszlVar.d.nextInt());
        }
    });

    public cszl(ffbr ffbrVar, Context context, cqoh cqohVar, dfpi dfpiVar, ctyx ctyxVar, errl errlVar, errl errlVar2) {
        this.a = ffbrVar;
        this.b = context;
        this.c = cqohVar;
        this.e = dfpiVar;
        this.f = ctyxVar;
        this.g = errlVar;
        this.i = new ejlc(new erog() { // from class: cszi
            @Override // defpackage.erog
            public final ListenableFuture a() {
                return elfo.e((Integer) cszl.this.h.get());
            }
        }, errlVar2);
        this.j = new ejlc(new erog() { // from class: cszj
            @Override // defpackage.erog
            public final ListenableFuture a() {
                cszl cszlVar = cszl.this;
                int i = cszlVar.e.i(cszlVar.b, 12200000) == 0 ? 0 : 1;
                if (!cszlVar.f.q("has_sent_a_message", false)) {
                    i |= 4;
                }
                if (cszlVar.f.d("max_conversation_count", 0) < ((Integer) cful.s.e()).intValue()) {
                    i |= 8;
                }
                if (cszlVar.f.q("has_dismissed_hats", false)) {
                    i |= 16;
                }
                long epochMilli = cszlVar.c.f().toEpochMilli();
                if (epochMilli - ((Long) cszt.o.e()).longValue() < Math.min(cszlVar.f.e("last_app_update_time_millis", epochMilli), cszlVar.f.e("app_install_time_millis", epochMilli))) {
                    i |= 32;
                }
                long epochMilli2 = cszlVar.c.f().toEpochMilli() - ((Long) cszt.m.e()).longValue();
                if (epochMilli2 < cszlVar.f.e("rating_prompt_last_time_millis", epochMilli2)) {
                    i |= 64;
                }
                int intValue = cvdd.a(cszlVar.b).b - ((Integer) cszt.n.e()).intValue();
                if (intValue < cszlVar.f.d("rating_prompt_shown_version", intValue)) {
                    i |= 128;
                }
                if (((Integer) cszlVar.h.get()).intValue() % ((Integer) cszt.p.e()).intValue() != 0) {
                    i |= 256;
                }
                return elfo.e(Integer.valueOf(i));
            }
        }, errlVar2);
    }

    public final elfl a() {
        return ((Boolean) cszt.r.e()).booleanValue() ? elfo.e(0) : elfl.g(this.j.c());
    }

    @Deprecated
    public final elfl b(elfl elflVar) {
        return elflVar.h(new emwl() { // from class: cszg
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(cszl.this.c.f().toEpochMilli() - ((Long) obj).longValue() < 259200000);
            }
        }, this.g);
    }

    public final elfl c() {
        return a().h(new emwl() { // from class: cszf
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return Boolean.valueOf(((Integer) obj).intValue() != 0);
            }
        }, this.g);
    }
}
