package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.mediapicker.c2o.ContentGridView;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class dbyk extends dcad {
    public static final dcle a;
    private static final eptv m;
    public final dbzj b;
    public final dbzl c;
    public boolean d;
    private final fr n;
    private final cqoh o;
    private final dbzh p;
    private final Context q;
    private final cxqk r;
    private final dbxy s;
    private final alct t;
    private final Executor u;
    private final ddzq v;
    private elfl w;

    static {
        eptq eptqVar = (eptq) eptv.a.createBuilder();
        epts eptsVar = epts.CONTACT;
        eptqVar.copyOnWrite();
        eptv eptvVar = (eptv) eptqVar.instance;
        eptvVar.c = eptsVar.v;
        eptvVar.b |= 1;
        eptu eptuVar = eptu.EXPANDED;
        eptqVar.copyOnWrite();
        eptv eptvVar2 = (eptv) eptqVar.instance;
        eptvVar2.d = eptuVar.e;
        eptvVar2.b |= 2;
        eptv eptvVar3 = (eptv) eptqVar.build();
        m = eptvVar3;
        dcle dcleVar = dcle.a;
        int i = dclf.b;
        a = new dclg(eptvVar3);
    }

    public dbyk(cqoh cqohVar, dbzh dbzhVar, dbzj dbzjVar, Context context, cxqk cxqkVar, alct alctVar, Executor executor, ddzq ddzqVar, dbzl dbzlVar, fr frVar, dbxy dbxyVar, ContentGridView contentGridView, int i) {
        super(eymn.CONTACT, contentGridView, i);
        this.o = cqohVar;
        this.p = dbzhVar;
        this.b = dbzjVar;
        this.q = context;
        this.r = cxqkVar;
        this.n = frVar;
        this.s = dbxyVar;
        this.t = alctVar;
        this.u = executor;
        this.c = dbzlVar;
        this.v = ddzqVar;
    }

    @Override // defpackage.dcae
    public final int a() {
        return R.dimen.c2o_contact_item_height;
    }

    @Override // defpackage.dcae
    public final int b() {
        return R.string.c2o_category_contact_content_description;
    }

    @Override // defpackage.dcae
    protected final int c() {
        return R.drawable.quantum_gm_ic_person_white_24;
    }

    @Override // defpackage.dcae
    public final Set d() {
        HashSet hashSet = new HashSet();
        hashSet.add(143);
        return hashSet;
    }

    @Override // defpackage.dcae
    public final void f(cxqz cxqzVar) {
        Intent intent;
        if (cxqzVar.a == 143) {
            if (cxqzVar.b == -1 && (intent = cxqzVar.c) != null) {
                Uri data = intent.getData();
                if (data == null || this.n == null) {
                    csjy.n("Bugle", "Not attaching vCard for selected contact because contact uri|fragmentManager is null.");
                } else {
                    final eohh eohhVar = eohh.CONTACT_CHOOSER;
                    if (this.d) {
                        this.w = this.p.c(data).h(new emwl() { // from class: dbyh
                            @Override // defpackage.emwl
                            public final Object apply(Object obj) {
                                dbyf dbyfVar = (dbyf) obj;
                                if (dbyfVar == null) {
                                    csjy.n("Bugle", "Not converting contact to plain text because the contact cannot be found.");
                                    return null;
                                }
                                dbyk dbykVar = dbyk.this;
                                dbykVar.i.j(new uej(dbykVar.b.a(dbyfVar)), dbyk.a, false);
                                return null;
                            }
                        }, this.u);
                    } else {
                        this.v.c(data, new ddzp() { // from class: dbyi
                            @Override // defpackage.ddzp
                            public final void a(Uri uri) {
                                boolean booleanValue = ((Boolean) cful.o.e()).booleanValue();
                                dbyk dbykVar = dbyk.this;
                                eohh eohhVar2 = eohhVar;
                                if (!booleanValue) {
                                    dbykVar.i.b(dbykVar.c.a(uri, eohhVar2), dbyk.a, false);
                                    return;
                                }
                                dbzn dbznVar = dbykVar.i;
                                ufq h = ufr.h();
                                h.d(uri);
                                h.b(eohhVar2);
                                dbznVar.a(h.a(), dbyk.a, false);
                            }
                        });
                    }
                }
            }
            alct alctVar = this.t;
            cqoh cqohVar = this.o;
            eptv eptvVar = m;
            cqohVar.f().toEpochMilli();
            alctVar.c(eptvVar, eptk.UNKNOWN_CLOSING_SOURCE);
        }
    }

    @Override // defpackage.dcae
    public final void g(Bundle bundle) {
        if (bundle == null || !bundle.containsKey("share_contact_in_plain_text")) {
            return;
        }
        this.d = bundle.getBoolean("share_contact_in_plain_text");
    }

    @Override // defpackage.dcad, defpackage.dcae
    public final void gB(View view) {
        super.gB(view);
        View inflate = LayoutInflater.from(this.q).inflate(R.layout.compose2o_contact_view, (ViewGroup) this.e, false);
        View findViewById = inflate.findViewById(R.id.contact_view);
        findViewById.setOnClickListener(this.r.a(new View.OnClickListener() { // from class: dbyg
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                boolean booleanValue = ((Boolean) dbzi.a.e()).booleanValue();
                dbyk dbykVar = dbyk.this;
                if (booleanValue) {
                    dbykVar.k(eptm.EXPAND);
                } else {
                    dbykVar.l(eptm.EXPAND);
                }
            }
        }));
        findViewById.setAccessibilityDelegate(this.f);
        this.e.removeAllViews();
        this.e.addView(inflate);
    }

    @Override // defpackage.dcae
    public final void h() {
        elfl elflVar = this.w;
        if (elflVar != null) {
            elflVar.cancel(true);
            this.w = null;
        }
    }

    @Override // defpackage.dcae
    public final void i(Bundle bundle) {
        bundle.putBoolean("share_contact_in_plain_text", this.d);
    }

    @Override // defpackage.dcat
    public final void j() {
        if (((Boolean) dbzi.a.e()).booleanValue()) {
            k(eptm.CATEGORY_HEADER);
        } else {
            l(eptm.CATEGORY_HEADER);
        }
    }

    public final void k(final eptm eptmVar) {
        Resources resources = this.q.getResources();
        CharSequence[] charSequenceArr = {resources.getText(R.string.shareDialogTypeFile), resources.getText(R.string.shareDialogTypeText)};
        DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: dbyj
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i) {
                boolean z = i == 1;
                dbyk dbykVar = dbyk.this;
                dbykVar.d = z;
                dbykVar.l(eptmVar);
            }
        };
        ehft ehftVar = new ehft(this.q);
        ehftVar.l(charSequenceArr, onClickListener);
        ehftVar.y(resources.getText(R.string.shareDialogTitle));
        ehftVar.create().show();
    }

    public final void l(eptm eptmVar) {
        this.o.f().toEpochMilli();
        dbxp dbxpVar = (dbxp) this.s;
        dbxpVar.C.a(dbxpVar.w);
        dbxpVar.q(epts.CONTACT, eptmVar);
    }

    @Override // defpackage.dcae
    public final boolean m() {
        return true;
    }
}
