package defpackage;

import android.app.Activity;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.function.Consumer$CC;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class wge extends lml {
    public boolean a;
    public boolean b;
    public boolean c;
    public Boolean d;
    public Boolean e;
    public vuk f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final alse k;
    private boolean l;
    private final ConversationIdType m;

    public wge(llv llvVar, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, cfyt cfytVar, ffsk ffskVar, ffbr ffbrVar4, alse alseVar) {
        llvVar.getClass();
        ffbrVar.getClass();
        ffbrVar3.getClass();
        cfytVar.getClass();
        ffskVar.getClass();
        alseVar.getClass();
        this.g = ffbrVar;
        this.h = ffbrVar2;
        this.i = ffbrVar3;
        this.j = ffbrVar4;
        this.k = alseVar;
        this.m = bdgq.b((String) llvVar.b("conversation_id"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final fgmh b() {
        Boolean bool = this.d;
        if (bool == null) {
            return null;
        }
        boolean booleanValue = bool.booleanValue();
        Boolean bool2 = this.e;
        if (bool2 == null) {
            return null;
        }
        boolean booleanValue2 = bool2.booleanValue();
        fgmg fgmgVar = (fgmg) fgmh.a.createBuilder();
        eyfw eyfwVar = fglu.b;
        fglr fglrVar = (fglr) fglu.a.createBuilder();
        fglrVar.copyOnWrite();
        fglu fgluVar = (fglu) fglrVar.instance;
        fgluVar.c |= 8;
        fgluVar.d = booleanValue;
        fglrVar.copyOnWrite();
        fglu fgluVar2 = (fglu) fglrVar.instance;
        fgluVar2.c |= 16;
        fgluVar2.e = booleanValue2;
        fgmgVar.e(eyfwVar, fglrVar.build());
        return (fgmh) fgmgVar.build();
    }

    public final void a(eisx eisxVar, Activity activity) {
        if (this.l || !this.a || !this.b || !this.c) {
            return;
        }
        this.l = true;
        ekzz f = eleg.f("ConversationStartupTrackers#onReady");
        try {
            ecqk.a.b(activity);
            this.k.d(alrv.r, 0, b());
            this.k.d(alrz.a, 0, b());
            alrv alrvVar = (alrv) this.g.b();
            alrvVar.f(alrv.s);
            alrvVar.f(alrv.t);
            alrvVar.f(alrv.u);
            alrvVar.f(csra.n);
            alrvVar.f(csra.m);
            alrvVar.c(new ecda("Conversation data loaded"));
            axnw.h(((cpdr) this.h.b()).a(eisxVar));
            if (activity != null && activity.getIntent().getBooleanExtra("via_rcs_not_delivered_notification", false)) {
                ((cluo) this.j.b()).a();
            }
            f = eleg.f("ConversationStartupTrackers#populateCache#convoV1");
            try {
                elfl a = ((azzz) this.i.b()).a(this.m);
                f.b(a);
                axnw.h(a);
                ffig.a(f, null);
                final vuk vukVar = this.f;
                if (vukVar != null) {
                    vukVar.a.bY.ifPresent(new Consumer() { // from class: vtv
                        @Override // java.util.function.Consumer
                        /* renamed from: accept */
                        public final void o(Object obj) {
                            ((cjxc) obj).a(vuk.this.a.M);
                        }

                        public final /* synthetic */ Consumer andThen(Consumer consumer) {
                            return Consumer$CC.$default$andThen(this, consumer);
                        }
                    });
                }
                ffig.a(f, null);
            } finally {
            }
        } catch (Throwable th) {
            try {
                throw th;
            } finally {
            }
        }
    }
}
