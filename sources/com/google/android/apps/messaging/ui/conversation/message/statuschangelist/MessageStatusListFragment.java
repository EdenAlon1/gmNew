package com.google.android.apps.messaging.ui.conversation.message.statuschangelist;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.ui.conversation.message.statuschangelist.MessageStatusListFragment;
import defpackage.alir;
import defpackage.aliv;
import defpackage.azwc;
import defpackage.bcqc;
import defpackage.bunm;
import defpackage.buoc;
import defpackage.cwpv;
import defpackage.czml;
import defpackage.czms;
import defpackage.im;
import defpackage.ksz;
import defpackage.kzp;
import defpackage.lon;
import defpackage.loo;
import defpackage.lox;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class MessageStatusListFragment extends czml implements lon<bunm> {
    public String ai;
    public aliv aj;
    public alir ak;
    public azwc al;
    public long am;
    private kzp an;
    private SimpleDateFormat ao;

    @Override // defpackage.gu, defpackage.ea
    public final View M(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        av(true);
        return layoutInflater.inflate(R.layout.message_status_list, viewGroup, false);
    }

    @Override // defpackage.lon
    public final lox a(int i, Bundle bundle) {
        this.an = new kzp(G(), new String[]{buoc.c.c.toString(), buoc.c.d.toString()}, new int[]{android.R.id.text1, android.R.id.text2});
        this.ao = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS", Locale.US);
        kzp kzpVar = this.an;
        kzpVar.g = new czms(this);
        gm(kzpVar);
        return this.al.a("DontKnow", z(), bcqc.m(z()), new ksz() { // from class: czmt
            @Override // defpackage.ksz
            public final Object a() {
                Object apply;
                String[] strArr = buoc.a;
                bunz bunzVar = new bunz(buoc.a);
                bunzVar.u();
                bunzVar.n(new dtzq("MIN($V - $V)", new Object[]{buoc.c.c, 0}), "minq");
                final MessageStatusListFragment messageStatusListFragment = MessageStatusListFragment.this;
                bunzVar.d(new Function() { // from class: czmm
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buob buobVar = (buob) obj;
                        buobVar.b(MessageStatusListFragment.this.ai);
                        return buobVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                final buny b = bunzVar.b();
                bunz bunzVar2 = new bunz(buoc.a);
                bunzVar2.u();
                bunzVar2.n(new dtzq("MAX($V + $V)", new Object[]{buoc.c.c, 0}), "maxq");
                bunzVar2.d(new Function() { // from class: czmn
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buob buobVar = (buob) obj;
                        buobVar.b(MessageStatusListFragment.this.ai);
                        return buobVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                final buny b2 = bunzVar2.b();
                String[] strArr2 = btdw.a;
                btdt btdtVar = new btdt(btdw.a);
                btdtVar.c(new Function() { // from class: czmo
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        btde btdeVar = (btde) obj;
                        btdf btdfVar = btdeVar.c;
                        return new btdf[]{btdeVar.a, btdeVar.b, btdfVar, btdfVar, btdeVar.d};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                apply = new Function() { // from class: czmp
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        btdv btdvVar = (btdv) obj;
                        btdvVar.aq(new dtru("events.timestamp", 9, buny.this));
                        btdvVar.aq(new dtru("events.timestamp", 10, b2));
                        return btdvVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }.apply(new btdv());
                btdtVar.k(new btdu((btdv) apply));
                btdtVar.n(new dtzq("$V", new Object[]{2}), "table_source");
                btdtVar.C((String) DesugarArrays.stream(new btdq[]{new btdq(btdw.c.b)}).map(new Function() { // from class: btds
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        return ((btdq) obj).a();
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.joining(", ")));
                btdr b3 = btdtVar.b();
                bunz bunzVar3 = new bunz(buoc.a);
                bunzVar3.z("MessageStatusListFragment#getQuery");
                bunzVar3.d(new Function() { // from class: czmq
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        buob buobVar = (buob) obj;
                        buobVar.b(MessageStatusListFragment.this.ai);
                        return buobVar;
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bunzVar3.c(new Function() { // from class: czmr
                    @Override // java.util.function.Function
                    /* renamed from: andThen */
                    public final /* synthetic */ Function mo448andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override // java.util.function.Function
                    public final Object apply(Object obj) {
                        bunk bunkVar = (bunk) obj;
                        return new bunl[]{bunkVar.a, bunkVar.c, bunkVar.d, bunkVar.e, bunkVar.f};
                    }

                    public final /* synthetic */ Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                });
                bunzVar3.n(new dtzq("$V", new Object[]{1}), "table_source");
                bunzVar3.p(b3);
                ((dtri) bunzVar3.a).j = buoc.c.c.toString();
                bunzVar3.r();
                return bunzVar3.b();
            }
        });
    }

    @Override // defpackage.ea
    public final void ae(Bundle bundle) {
        super.ae(bundle);
        loo.a(this).c(0, bundle, this);
        this.ai = G().getIntent().getStringExtra("message_id");
    }

    @Override // defpackage.lon
    public final /* bridge */ /* synthetic */ void b(lox loxVar, Object obj) {
        im k;
        bunm bunmVar = (bunm) obj;
        this.an.h(bunmVar.a());
        if (bunmVar == null || !bunmVar.moveToFirst()) {
            this.am = 0L;
        } else {
            this.am = bunmVar.e();
        }
        if (!(G() instanceof cwpv) || (k = ((cwpv) G()).k()) == null) {
            return;
        }
        k.setSubtitle("Id: " + this.ai + " Time: " + this.ao.format(Long.valueOf(this.am)));
    }

    @Override // defpackage.lon
    public final void c(lox loxVar) {
        this.an.h(null);
    }
}
