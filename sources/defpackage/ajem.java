package defpackage;

import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.api.messaging.Conversation;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import j$.util.Optional;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ajem implements ajei {
    public static final enru a = enru.c("com/google/android/apps/messaging/penpal/entrypoint/PenpalEntryPointImpl");
    public final ffbr b;
    public aeac c;
    public ffix d;
    public boolean e;
    public boolean f;
    private final ejlq g;
    private final ejxn h;
    private final elbx i;
    private final Optional j;
    private final ffbr k;
    private final ffbr l;
    private final ffbr m;
    private final ffbr n;
    private FloatingActionButton o;
    private final AnonymousClass1 p;
    private final ajen q;

    /* JADX WARN: Type inference failed for: r1v2, types: [ajem$1] */
    public ajem(ejlq ejlqVar, ejxn ejxnVar, elbx elbxVar, Optional optional, ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5) {
        ejlqVar.getClass();
        ejxnVar.getClass();
        elbxVar.getClass();
        optional.getClass();
        ffbrVar.getClass();
        ffbrVar3.getClass();
        ffbrVar5.getClass();
        this.g = ejlqVar;
        this.h = ejxnVar;
        this.i = elbxVar;
        this.j = optional;
        this.k = ffbrVar;
        this.l = ffbrVar2;
        this.m = ffbrVar3;
        this.n = ffbrVar4;
        this.b = ffbrVar5;
        this.d = new ffix() { // from class: ajej
            @Override // defpackage.ffix
            public final Object invoke() {
                return ffcu.a;
            }
        };
        this.p = new ejlr<Void, Conversation>() { // from class: ajem.1
            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void c(Object obj, Object obj2) {
                Conversation conversation = (Conversation) obj2;
                conversation.getClass();
                aeac aeacVar = ajem.this.c;
                if (aeacVar == null) {
                    ((enrr) ajem.a.j().h("com/google/android/apps/messaging/penpal/entrypoint/PenpalEntryPointImpl$launchConversationCallback$1", "onSuccess", 64, "PenpalEntryPointImpl.kt")).q("Failed to launch penpal chat, host is null");
                    return;
                }
                aeacVar.e(conversation.d(), null, false);
                ajgd ajgdVar = (ajgd) ajem.this.b.b();
                eqbx eqbxVar = (eqbx) eqbz.a.createBuilder();
                eqbxVar.getClass();
                eqvn.b(4, eqbxVar);
                ajgdVar.a(eqvn.a(eqbxVar));
            }

            @Override // defpackage.ejlr
            public final /* bridge */ /* synthetic */ void m(Object obj, Throwable th) {
                ((enrr) ((enrr) ajem.a.j()).g(th).h("com/google/android/apps/messaging/penpal/entrypoint/PenpalEntryPointImpl$launchConversationCallback$1", "onFailure", 69, "PenpalEntryPointImpl.kt")).q("Failed to get the launch conversation callback");
            }

            @Override // defpackage.ejlr
            public final /* synthetic */ void b(Object obj) {
            }
        };
        this.q = new ajen(this);
    }

    public static final Boolean h() {
        return (Boolean) ((cfup) ctjd.ak.get()).e();
    }

    @Override // defpackage.ajei
    public final void a() {
        FloatingActionButton floatingActionButton = this.o;
        if (floatingActionButton != null) {
            floatingActionButton.d(true);
        }
    }

    @Override // defpackage.ajei
    public final void b(View view, final Runnable runnable, final ffix ffixVar) {
        FloatingActionButton floatingActionButton;
        if (this.o == null) {
            FloatingActionButton floatingActionButton2 = (FloatingActionButton) view.findViewById(R.id.penpal_fab);
            this.o = floatingActionButton2;
            if (floatingActionButton2 != null) {
                floatingActionButton2.setImageResource(R.drawable.gemini_spark_filled);
            }
            FloatingActionButton floatingActionButton3 = this.o;
            if (floatingActionButton3 != null) {
                cjdk cjdkVar = (cjdk) fflm.b(this.j);
                floatingActionButton3.setContentDescription(cjdkVar != null ? cjdkVar.s() : "");
            }
            if (runnable != null && (floatingActionButton = this.o) != null) {
                floatingActionButton.setOnClickListener(new elay(this.i, "penpalFab#onClick", new View.OnClickListener() { // from class: ajel
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        runnable.run();
                    }
                }));
            }
        }
        if (!((Boolean) ((cfup) ctjd.ak.get()).e()).booleanValue()) {
            ffixVar.invoke();
            return;
        }
        this.d = new ffix() { // from class: ajek
            @Override // defpackage.ffix
            public final Object invoke() {
                ffix.this.invoke();
                this.e = true;
                return ffcu.a;
            }
        };
        if (this.e) {
            return;
        }
        ffixVar.invoke();
        this.e = true;
    }

    @Override // defpackage.ajei
    public final void c(aeac aeacVar) {
        ejlp ejlpVar = new ejlp(((alxl) this.m.b()).m(Optional.empty(), engw.r(((aqkp) this.l.b()).f(((aolr) this.k.b()).v())), null));
        this.c = aeacVar;
        this.g.i(ejlpVar, new ejlm(null), this.p);
    }

    @Override // defpackage.ajei
    public final void d(aeac aeacVar) {
        this.c = aeacVar;
        this.g.k(this.p);
        this.h.g(R.id.penpal_entry_point_setting, ((cjeo) this.n.b()).a(), this.q);
    }

    @Override // defpackage.ajei
    public final void e() {
        FloatingActionButton floatingActionButton = this.o;
        if (floatingActionButton != null) {
            floatingActionButton.e(true);
        }
    }

    @Override // defpackage.ajei
    public final /* bridge */ /* synthetic */ boolean f() {
        return h().booleanValue();
    }

    @Override // defpackage.ajei
    public final boolean g() {
        return h().booleanValue() && this.f;
    }
}
