package com.google.android.apps.messaging.shared.ui.attachment;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ProgressBar;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.apps.messaging.shared.ui.attachment.MessageAttachmentContainer;
import com.google.android.apps.messaging.ui.conversation.message.transferview.TransferView;
import defpackage.adgn;
import defpackage.cfup;
import defpackage.cjgo;
import defpackage.cjgp;
import defpackage.cjgu;
import defpackage.cjgv;
import defpackage.cjgx;
import defpackage.cjgz;
import defpackage.cjhw;
import defpackage.cjhz;
import defpackage.cjia;
import defpackage.cjjc;
import defpackage.cjjd;
import defpackage.cric;
import defpackage.crih;
import defpackage.crii;
import defpackage.crij;
import defpackage.crik;
import defpackage.criw;
import defpackage.criy;
import defpackage.criz;
import defpackage.crnx;
import defpackage.csjc;
import defpackage.csjy;
import defpackage.cxqh;
import defpackage.czmy;
import defpackage.czmz;
import defpackage.czna;
import defpackage.ellq;
import defpackage.ffbr;
import defpackage.ffdx;
import defpackage.shw;
import j$.util.Collection;
import j$.util.Objects;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class MessageAttachmentContainer extends criz {
    public List a;
    public crik b;
    public final Map c;
    public final List d;
    public crih e;
    public adgn f;
    public ffbr g;
    private cjia h;
    private final LayoutInflater i;
    private String j;

    public MessageAttachmentContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.a = new ArrayList();
        this.c = new HashMap();
        this.d = new ArrayList();
        this.j = null;
        this.i = LayoutInflater.from(context);
    }

    public final void a(criw criwVar) {
        int i;
        int i2;
        Uri t;
        Uri t2;
        List list = criwVar.a;
        if (list.size() == this.a.size() && ((!this.f.a().isPresent() || Objects.equals(criwVar.e, this.h)) && Objects.equals(criwVar.f, this.j))) {
            for (0; i2 < this.a.size(); i2 + 1) {
                MessagePartCoreData messagePartCoreData = (MessagePartCoreData) this.a.get(i2);
                MessagePartCoreData messagePartCoreData2 = (MessagePartCoreData) list.get(i2);
                if (((Boolean) this.g.b()).booleanValue()) {
                    t = messagePartCoreData.v() != null ? messagePartCoreData.v() : messagePartCoreData.t();
                    t2 = messagePartCoreData2.v() != null ? messagePartCoreData2.v() : messagePartCoreData2.t();
                } else {
                    t = messagePartCoreData.t();
                    t2 = messagePartCoreData2.t();
                }
                Uri x = messagePartCoreData.x();
                String V = messagePartCoreData.V();
                i2 = ((t == null && x == null) || V == null || (t != null && (!t.equals(t2) || !V.equals(messagePartCoreData2.V()))) || ((x != null && !x.equals(messagePartCoreData2.x())) || (((Boolean) ((cfup) shw.a.get()).e()).booleanValue() && !Objects.equals(messagePartCoreData.F(), messagePartCoreData2.F())))) ? 0 : i2 + 1;
            }
            return;
        }
        List<MessagePartCoreData> list2 = criwVar.a;
        removeAllViews();
        this.c.clear();
        ArrayList arrayList = new ArrayList();
        Optional a = this.f.a();
        boolean isPresent = a.isPresent();
        this.j = criwVar.f;
        for (MessagePartCoreData messagePartCoreData3 : list2) {
            if (isPresent && messagePartCoreData3.bm()) {
                arrayList.add(messagePartCoreData3);
            } else if (messagePartCoreData3.bq()) {
                cric g = this.e.g(this.i, messagePartCoreData3, this, 1, criwVar.b);
                if (g == null) {
                    csjy.n("Bugle", "Generated null attachment preview for part ".concat(String.valueOf(String.valueOf(messagePartCoreData3))));
                } else {
                    crii criiVar = g.a;
                    if (criiVar != null) {
                        criiVar.g(messagePartCoreData3, criwVar.c, criwVar.f, 1);
                    }
                    if (g.b != null) {
                        b(messagePartCoreData3);
                        this.d.add(g);
                        addView(g.b);
                        if (messagePartCoreData3.ba() && (criiVar instanceof crij)) {
                            ((crij) criiVar).b(this.b);
                        }
                    } else {
                        csjy.n("Bugle", "Skipped adding attachment view for part ".concat(String.valueOf(String.valueOf(messagePartCoreData3))));
                    }
                }
            } else {
                csjy.i("Bugle", "Skipped displaying non-media attachment part ".concat(String.valueOf(String.valueOf(messagePartCoreData3))));
            }
        }
        if (isPresent) {
            if (!arrayList.isEmpty()) {
                Context context = getContext();
                context.getClass();
                cjjd H = new cjjc(context).H();
                cjia cjiaVar = criwVar.e;
                final criy criyVar = criwVar.b;
                if (arrayList.isEmpty()) {
                    throw new IllegalArgumentException("Cannot update appearance with no Google Photos attachments.");
                }
                ArrayList arrayList2 = new ArrayList(ffdx.n(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    Uri t3 = ((MessagePartCoreData) it.next()).t();
                    t3.getClass();
                    arrayList2.add(t3);
                }
                final cjgo a2 = ((cjgp) H.b.b()).a(new cjgx(H.a));
                final MessagePartCoreData messagePartCoreData4 = (MessagePartCoreData) ffdx.K(arrayList);
                Context context2 = a2.b.b.getContext();
                context2.getClass();
                final cjgz cjgzVar = new cjgz(context2, cjiaVar, cjgo.b(arrayList));
                cjgv a3 = a2.a(cjgzVar);
                czmz czmzVar = null;
                if (a3 != null) {
                    a3.a().setOnLongClickListener(new View.OnLongClickListener() { // from class: cjgm
                        @Override // android.view.View.OnLongClickListener
                        public final boolean onLongClick(View view) {
                            return criy.this.i(messagePartCoreData4, a2.a.g(view), true);
                        }
                    });
                    a3.a().setOnClickListener(new View.OnClickListener() { // from class: cjgn
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            cjia cjiaVar2;
                            criy criyVar2 = criy.this;
                            MessagePartCoreData messagePartCoreData5 = messagePartCoreData4;
                            cjgo cjgoVar = a2;
                            if (criyVar2.i(messagePartCoreData5, cjgoVar.a.g(view), false) || (cjiaVar2 = cjgzVar.a) == null) {
                                return;
                            }
                            if (cjiaVar2.b != 103) {
                                cjiaVar2 = null;
                            }
                            if (cjiaVar2 != null) {
                                Context context3 = cjgoVar.b.b.getContext();
                                context3.getClass();
                                eldl.p(context3, new Intent("android.intent.action.VIEW", Uri.parse((cjiaVar2.b == 103 ? (cjhs) cjiaVar2.c : cjhs.a).c)));
                            }
                        }
                    });
                } else {
                    a3 = null;
                }
                H.c = a3;
                cjgv cjgvVar = H.c;
                if (cjgvVar instanceof cjgu) {
                    int a4 = cjiaVar != null ? cjhz.a(cjiaVar.b) : 0;
                    if (a4 != 0 && a4 - 1 != 0 && i != 2 && i != 3 && i != 4) {
                        String string = H.a.getContext().getString(R.string.upload_cancel_content_description);
                        string.getClass();
                        Drawable k = cxqh.k(H.a.getContext());
                        String str = (cjiaVar.b == 102 ? (cjhw) cjiaVar.c : cjhw.a).c;
                        str.getClass();
                        czmzVar = new czmz(string, k, new czmy.a(str));
                    }
                    Object a5 = ((cjgu) cjgvVar).b.a();
                    a5.getClass();
                    TransferView transferView = (TransferView) a5;
                    if (czmzVar == null) {
                        transferView.setVisibility(8);
                    } else {
                        czna H2 = transferView.H();
                        H2.c.setImageResource(R.drawable.ic_cancel_small_light);
                        H2.a.setContentDescription(czmzVar.a);
                        H2.a.setBackground(czmzVar.b);
                        ((ellq) H2.b.b()).b(H2.a, czmzVar.c);
                        crnx.h(H2.a, crnx.b);
                        ProgressBar progressBar = transferView.H().d;
                        progressBar.setIndeterminate(!csjc.j());
                        progressBar.setVisibility(0);
                    }
                }
                addView(H.a);
                Collection.EL.stream(arrayList).forEach(new Consumer() { // from class: crit
                    @Override // java.util.function.Consumer
                    public final void accept(Object obj) {
                        MessageAttachmentContainer.this.b((MessagePartCoreData) obj);
                    }

                    public final /* synthetic */ Consumer andThen(Consumer consumer) {
                        return Consumer$CC.$default$andThen(this, consumer);
                    }
                });
            }
            this.h = criwVar.e;
        }
        this.a = list2;
    }

    public final void b(MessagePartCoreData messagePartCoreData) {
        Uri t = messagePartCoreData.t();
        Uri x = messagePartCoreData.x();
        if (t != null) {
            this.c.put(t, Integer.valueOf(getChildCount()));
        }
        if (x != null) {
            this.c.put(x, Integer.valueOf(getChildCount()));
        }
    }
}
