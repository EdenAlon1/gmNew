package defpackage;

import android.app.Activity;
import android.content.ClipData;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.DragAndDropPermissions;
import android.view.DragEvent;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.replies.snippet.RepliedToDataAdapter;
import com.google.android.apps.messaging.shared.api.messaging.conversation.bugle.DefaultConversation;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import com.google.android.apps.messaging.ui.attachment.AttachmentsContainer;
import com.google.android.apps.messaging.ui.conversation.ComposeMessageView;
import defpackage.ekkz;
import j$.util.Optional;
import j$.util.function.BiConsumer$CC;
import j$.util.function.Consumer$CC;
import java.util.Locale;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import ucd.a;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class uau extends ucn implements ekhu, fbas, ekhq, ekkk, elar, ellr {
    public final lkv a = new lkv(this);
    private final ells ag = new ells();
    private boolean ah;
    private ucd d;
    private Context e;

    @Deprecated
    public uau() {
        efbd.c();
    }

    @Override // defpackage.ekhu
    public final Class F() {
        return ucd.class;
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.c.k();
        try {
            s(layoutInflater, viewGroup, bundle);
            final ucd H = H();
            View inflate = layoutInflater.inflate(true != ((Boolean) ctjd.aQ.e()).booleanValue() ? R.layout.draft_editor_fragment : R.layout.draft_editor_fragment_smarter_panther, viewGroup, false);
            H.z = (ComposeMessageView) inflate.findViewById(R.id.draft_message_view);
            H.y = (AttachmentsContainer) inflate.findViewById(R.id.attachments_container);
            H.x.b = H.I;
            H.z.H().c.z = H.q;
            H.z.H().c.n(H.I);
            if (H.L != null) {
                H.z.H().w(H.L);
            }
            bcpw bcpwVar = H.A;
            if (bcpwVar != null && bcpwVar.g()) {
                H.z.H().K(H.A);
            }
            H.z.H().J(H.b);
            ea eaVar = H.l;
            lkk P = eaVar.P();
            eaVar.z().getClass();
            tzj tzjVar = (tzj) H.i.a(tzj.class);
            H.u.b(tzjVar.b().a(), new ubr(H));
            ejuh b = H.p.b(P, H.g.a, H.s(H.I.t()));
            H.u.b(b, new ubs(H));
            H.u.b(H.p.a(b), new ubt(H));
            H.u.b(tzjVar.a().a(), new ubu(H));
            H.u.b(H.E.a(H.b), new ubw(H));
            H.u.b(((byzz) H.W.b()).a(((DefaultConversation) ((amhs) H.V.b()).H(H.g, false)).g, "SimPicker::localSelfIdentities", H.l.P()), new ubz(H));
            H.u.b(H.s.a(), new ubx(H));
            boolean z = bundle != null;
            H.D = (EditText) H.z.findViewById(R.id.compose_message_text);
            H.J = (EditText) H.z.findViewById(R.id.compose_subject_text);
            H.D.setOnFocusChangeListener(new elax(H.w, new View.OnFocusChangeListener() { // from class: uay
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z2) {
                    ucd ucdVar = ucd.this;
                    if (view == ucdVar.D && z2) {
                        if (Build.VERSION.SDK_INT <= 32) {
                            ucdVar.n.isActive(ucdVar.D);
                        }
                        ucdVar.M = ucdVar.D;
                        ucdVar.L.ah();
                    }
                }
            }, "DraftEditorFragmentPeer draftBodyEditText onFocusChange"));
            H.D.setOnEditorActionListener(new elbm(H.w, new TextView.OnEditorActionListener() { // from class: uaz
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
                    if (i != 4) {
                        return false;
                    }
                    ucd ucdVar = ucd.this;
                    ucdVar.z(new akzo(((cqoh) ucdVar.e.b()).f().toEpochMilli(), ((cqoh) ucdVar.e.b()).a()), true, true, false, true != ucdVar.z.H().V() ? 1 : 2);
                    return true;
                }
            }, "DraftEditorFragmentPeer#draftBodyEditText#onEditorAction"));
            H.D.addTextChangedListener(new elbq(H.w, new ucb(H, z), "DraftEditorFragmentPeer draftBodyEditText textWatcher"));
            H.J.setOnFocusChangeListener(new elax(H.w, new View.OnFocusChangeListener() { // from class: uba
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z2) {
                    ucd ucdVar = ucd.this;
                    EditText editText = ucdVar.J;
                    if (view == editText && z2) {
                        ucdVar.M = editText;
                    }
                }
            }, "DraftEditorFragmentPeer draftSubjectEditText onFocusChange"));
            alcb alcbVar = H.c;
            ea eaVar2 = H.l;
            if (!(eaVar2 instanceof uau)) {
                throw new AssertionError("The fragment should be DraftEditorFragment but is ".concat(String.valueOf(eaVar2.getClass().getName())));
            }
            final uat uatVar = new uat(alcbVar, ((uau) eaVar2).H(), H.o);
            final String[] strArr = (String[]) uat.a.toArray(new String[0]);
            final eg G = H.l.G();
            G.getClass();
            ComposeMessageView composeMessageView = H.z;
            final EditText[] editTextArr = {H.D, H.J};
            final egyg egygVar = new egyg(composeMessageView, new emxg() { // from class: egyd
                @Override // defpackage.emxg
                public final boolean a(Object obj) {
                    DragEvent dragEvent = (DragEvent) obj;
                    if (dragEvent.getLocalState() != null) {
                        return false;
                    }
                    for (String str : strArr) {
                        if (dragEvent.getClipDescription().hasMimeType(str)) {
                            return true;
                        }
                    }
                    return false;
                }
            });
            for (int i = 0; i < 2; i++) {
                EditText editText = editTextArr[i];
                if (Build.VERSION.SDK_INT <= 30 && !(editText instanceof qw)) {
                    editText.setOnDragListener(new View.OnDragListener() { // from class: egyf
                        @Override // android.view.View.OnDragListener
                        public final boolean onDrag(View view, DragEvent dragEvent) {
                            DragAndDropPermissions requestDragAndDropPermissions;
                            if (dragEvent.getAction() != 3) {
                                return egygVar.a(view, dragEvent);
                            }
                            ClipData clipData = dragEvent.getClipData();
                            ktm a = ktf.a(Build.VERSION.SDK_INT >= 31 ? new ktg(clipData, 3) : new kti(clipData, 3));
                            ClipData clipData2 = dragEvent.getClipData();
                            int i2 = 0;
                            while (true) {
                                kue kueVar = uatVar;
                                if (i2 >= clipData2.getItemCount()) {
                                    kueVar.a(view, a);
                                    return true;
                                }
                                if (clipData2.getItemAt(i2).getUri() != null) {
                                    requestDragAndDropPermissions = G.requestDragAndDropPermissions(dragEvent);
                                    if (requestDragAndDropPermissions == null) {
                                        Log.e("DropHelper", "Could not get permissions for dropped data.");
                                        return true;
                                    }
                                    kueVar.a(view, a);
                                    return true;
                                }
                                i2++;
                            }
                        }
                    });
                }
                kvo.s(editText, strArr, uatVar);
                editText.setOnDragListener(new View.OnDragListener() { // from class: egyc
                    @Override // android.view.View.OnDragListener
                    public final boolean onDrag(View view, DragEvent dragEvent) {
                        return egyg.this.a(view, dragEvent);
                    }
                });
            }
            composeMessageView.setOnDragListener(new View.OnDragListener() { // from class: egye
                @Override // android.view.View.OnDragListener
                public final boolean onDrag(View view, DragEvent dragEvent) {
                    if (dragEvent.getAction() != 3) {
                        return egygVar.a(view, dragEvent);
                    }
                    int i2 = 0;
                    while (true) {
                        EditText[] editTextArr2 = editTextArr;
                        if (i2 >= 2) {
                            editTextArr2[0].onDragEvent(dragEvent);
                            return true;
                        }
                        EditText editText2 = editTextArr2[i2];
                        if (editText2.hasFocus()) {
                            return editText2.onDragEvent(dragEvent);
                        }
                        i2++;
                    }
                }
            });
            H.M = H.D;
            if (inflate == null) {
                uci.a(this, H());
            }
            ekyf.q();
            return inflate;
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea, defpackage.lkr
    public final lkk P() {
        return this.a;
    }

    @Override // defpackage.ekhu
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ucd H() {
        ucd ucdVar = this.d;
        if (ucdVar == null) {
            throw new IllegalStateException("peer() called before initialized.");
        }
        if (this.ah) {
            throw new IllegalStateException("peer() called after destroyed.");
        }
        return ucdVar;
    }

    @Override // defpackage.ea
    public final void aA(boolean z) {
        if (z) {
            throw new IllegalArgumentException("Peered fragments cannot be retained, to avoid memory leaks. If you need a retained fragment, you should subclass Fragment directly. See http://go/tiktok-conformance-violations/FRAGMENT_SET_RETAIN_INSTANCE");
        }
    }

    @Override // defpackage.ea
    public final void aD(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        aQ(intent);
    }

    @Override // defpackage.ea
    public final void aQ(Intent intent) {
        if (ekht.a(intent, z().getApplicationContext())) {
            eldl.o(intent);
        }
        super.aQ(intent);
    }

    @Override // defpackage.ekhq
    @Deprecated
    public final Context aZ() {
        if (this.e == null) {
            this.e = new ekkn(this, super.z());
        }
        return this.e;
    }

    @Override // defpackage.ucn, defpackage.efaf, defpackage.ea
    public final void ag(Activity activity) {
        this.c.k();
        try {
            super.ag(activity);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void ap(View view, Bundle bundle) {
        this.c.k();
        try {
            ellg.b(this).b = view;
            H();
            uci.a(this, H());
            bm(view, bundle);
            ((arcs) H().d.b()).d();
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ea
    public final void at(Bundle bundle) {
        Bundle bundle2 = this.m;
        boolean z = true;
        if (bundle2 != null && bundle2 != bundle) {
            z = false;
        }
        emxf.m(z, "Cannot overwrite fragment arguments. See - http://go/tiktok/dev/dagger/fragmentpeers.md#argument");
        super.at(bundle);
    }

    @Override // defpackage.ucn
    protected final /* bridge */ /* synthetic */ ekky b() {
        return new ekkt(this, true);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final elds bb() {
        return this.c.a;
    }

    @Override // defpackage.ekkk
    public final Locale bc() {
        return ekkj.a(this);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final void bd(elds eldsVar, boolean z) {
        this.c.e(eldsVar, z);
    }

    @Override // defpackage.ekkd, defpackage.elar
    public final void be(elds eldsVar) {
        this.c.b = eldsVar;
    }

    @Override // defpackage.ellr
    public final elli e(ellf ellfVar) {
        return this.ag.a(ellfVar);
    }

    @Override // defpackage.ellr
    public final void f(Class cls, ellh ellhVar) {
        this.ag.b(cls, ellhVar);
    }

    @Override // defpackage.ucn, defpackage.ekkd, defpackage.ea
    public final void g(Context context) {
        this.c.k();
        try {
            if (this.ah) {
                throw new IllegalStateException("A Fragment cannot be attached more than once. Instead, create a new Fragment instance.");
            }
            super.g(context);
            if (this.d == null) {
                try {
                    Object aX = aX();
                    fbbf fbbfVar = ((akgo) aX).b.aM;
                    fbbf fbbfVar2 = ((akgo) aX).o;
                    fbbf fbbfVar3 = ((akgo) aX).a.cS;
                    alcb alcbVar = (alcb) ((akgo) aX).p.b();
                    fbbf fbbfVar4 = ((akgo) aX).t;
                    akis akisVar = ((akgo) aX).a;
                    fbbf fbbfVar5 = akisVar.a.u;
                    fbbf fbbfVar6 = akisVar.aU;
                    fbbf fbbfVar7 = ((akgo) aX).u;
                    fbbf fbbfVar8 = akisVar.cz;
                    wgc e = ((akgo) aX).e();
                    fbbf fbbfVar9 = ((akgo) aX).a.a.dQ;
                    wpk wpkVar = (wpk) ((akgo) aX).v.b();
                    uea c = ((akgo) aX).c();
                    fbbf fbbfVar10 = ((akgo) aX).B;
                    bcvs bcvsVar = (bcvs) ((akgo) aX).D.b();
                    fbbf fbbfVar11 = ((akgo) aX).E;
                    ea eaVar = (ea) ((fbbb) ((akgo) aX).e).a;
                    ejlq ejlqVar = (ejlq) ((akgo) aX).f.b();
                    adgn adgnVar = (adgn) ((akgo) aX).x.b();
                    InputMethodManager inputMethodManager = (InputMethodManager) ((Context) ((akgo) aX).a.b.a.q.b()).getSystemService("input_method");
                    inputMethodManager.getClass();
                    bcxm bcxmVar = (bcxm) ((akgo) aX).a.a.nQ.b();
                    tym a = ((akgo) aX).d.a();
                    akkp akkpVar = ((akgo) aX).a.a;
                    fbbf fbbfVar12 = akkpVar.aO;
                    fbbf fbbfVar13 = akkpVar.cf;
                    cvmd y = ((akgo) aX).y();
                    fbbf fbbfVar14 = ((akgo) aX).a.a.c;
                    ejwl ejwlVar = (ejwl) ((akgo) aX).g.b();
                    ejxn ejxnVar = (ejxn) ((akgo) aX).n.b();
                    elbx elbxVar = (elbx) ((akgo) aX).b.ap.b();
                    aepz p = ((akgo) aX).p();
                    fbbf fbbfVar15 = ((akgo) aX).a.a.fP;
                    adgn adgnVar2 = (adgn) ((akgo) aX).b.oe.b();
                    akis akisVar2 = ((akgo) aX).a;
                    akkp akkpVar2 = akisVar2.a;
                    fbbf fbbfVar16 = akkpVar2.xP;
                    fbbf fbbfVar17 = akkpVar2.gp;
                    fbbf fbbfVar18 = akisVar2.iq;
                    fbbf fbbfVar19 = akkpVar2.Z;
                    fbbf fbbfVar20 = akkpVar2.nk;
                    fbbf fbbfVar21 = akisVar2.cI;
                    fbbf fbbfVar22 = ((akgo) aX).F;
                    fbbf fbbfVar23 = ((akgo) aX).G;
                    String aa = ((akgo) aX).aa();
                    eisx eisxVar = (eisx) ((akgo) aX).b.b.b();
                    akis akisVar3 = ((akgo) aX).a;
                    this.d = new ucd(fbbfVar, fbbfVar2, fbbfVar3, alcbVar, fbbfVar4, fbbfVar5, fbbfVar6, fbbfVar7, fbbfVar8, e, fbbfVar9, wpkVar, c, fbbfVar10, bcvsVar, fbbfVar11, eaVar, ejlqVar, adgnVar, inputMethodManager, bcxmVar, a, fbbfVar12, fbbfVar13, y, fbbfVar14, ejwlVar, ejxnVar, elbxVar, p, fbbfVar15, adgnVar2, fbbfVar16, fbbfVar17, fbbfVar18, fbbfVar19, fbbfVar20, fbbfVar21, fbbfVar22, fbbfVar23, aa, eisxVar, akisVar3.b.hz, akisVar3.a.wi);
                    this.Z.c(new ekkg(this.c, this.a));
                } catch (ClassCastException e2) {
                    throw new IllegalStateException("Missing entry point. If you're in a test with explicit entry points specified in your @TestRoot, check that you're not missing the one for this class.", e2);
                }
            }
            ekyf.q();
        } finally {
        }
    }

    @Override // defpackage.ea
    public final LayoutInflater gI(Bundle bundle) {
        this.c.k();
        try {
            LayoutInflater aO = aO();
            LayoutInflater cloneInContext = aO.cloneInContext(new ekkz.a(aO, this));
            LayoutInflater cloneInContext2 = cloneInContext.cloneInContext(new ekkn(this, cloneInContext));
            ekyf.q();
            return cloneInContext2;
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void h(Bundle bundle) {
        this.c.k();
        try {
            aY(bundle);
            final ucd H = H();
            H.I.g = new ucc(H);
            H.f.a(bundle);
            H.K = H.new a();
            H.m.k(H.K);
            H.m.k(H.x);
            H.m.k(((arcs) H.d.b()).d);
            ((Optional) H.k.b()).ifPresent(new Consumer() { // from class: ubp
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    ajte ajteVar = (ajte) obj;
                    final ucd ucdVar = ucd.this;
                    BiConsumer biConsumer = new BiConsumer() { // from class: ubg
                        @Override // java.util.function.BiConsumer
                        public final void accept(Object obj2, Object obj3) {
                            cnmd a = cnmc.a((MessageIdType) obj2);
                            ucd ucdVar2 = ucd.this;
                            ucdVar2.I.y = a;
                            ucdVar2.z.H().P((RepliedToDataAdapter) obj3);
                            ucdVar2.f(true);
                        }

                        public final /* synthetic */ BiConsumer andThen(BiConsumer biConsumer2) {
                            return BiConsumer$CC.$default$andThen(this, biConsumer2);
                        }
                    };
                    ffsk ffskVar = (ffsk) ajteVar.a.b();
                    ffskVar.getClass();
                    ajtb ajtbVar = (ajtb) ajteVar.b.b();
                    ajtbVar.getClass();
                    ajql ajqlVar = (ajql) ajteVar.c.b();
                    ajqlVar.getClass();
                    ucdVar.Y = new ajth(ffskVar, ajtbVar, ajqlVar, biConsumer);
                    ucdVar.m.k(ucdVar.Y.d);
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
            H.v.g(R.id.rcs_settings_data_local_subscription_id, ((cmgr) H.Q.b()).c(), new uce(H));
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void i() {
        elav b = this.c.b();
        try {
            bf();
            ucd H = H();
            H.z.H().B();
            H.z.H().R();
            b.close();
        } catch (Throwable th) {
            try {
                b.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.efaf, defpackage.ea
    public final void j() {
        elav a = this.c.a();
        try {
            bg();
            this.ah = true;
            a.close();
        } catch (Throwable th) {
            try {
                a.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void k(Bundle bundle) {
        this.c.k();
        try {
            bj(bundle);
            H().z.H().H(bundle);
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ekkd, defpackage.efaf, defpackage.ea
    public final void l() {
        this.c.k();
        try {
            bk();
            ucd H = H();
            H.z.H().D();
            if (((Boolean) cful.q.e()).booleanValue()) {
                Context z = H.l.z();
                z.getClass();
                if (algx.a(z) == 3) {
                    H.z.H().L(H.g.a);
                }
            }
            ekyf.q();
        } catch (Throwable th) {
            try {
                ekyf.q();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    @Override // defpackage.ucn, defpackage.ea
    public final Context z() {
        if (super.z() == null) {
            return null;
        }
        return aZ();
    }
}
