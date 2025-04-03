package defpackage;

import android.content.Context;
import android.os.Handler;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;
import com.google.android.apps.messaging.R;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.MessageIdType;
import j$.util.Collection;
import j$.util.Optional;
import j$.util.function.Consumer$CC;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.function.Consumer;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class upx implements ljv {
    public final Optional a;
    public final uqi b;
    public final ura c;
    public final upq d;
    public final upr e;
    public final cxqd f;
    private final uws g;

    public upx(uqz uqzVar, final cqoh cqohVar, ups upsVar, uqj uqjVar, ffbr ffbrVar, Optional optional, Context context, LinearLayoutManager linearLayoutManager, final czic czicVar, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        cxqd cxqdVar = (cxqd) ffbrVar.b();
        this.f = cxqdVar;
        Context context2 = (Context) upsVar.a.b();
        context2.getClass();
        cqoh cqohVar2 = (cqoh) upsVar.b.b();
        cqohVar2.getClass();
        upr uprVar = new upr(context2, cqohVar2, czicVar);
        this.e = uprVar;
        cxqdVar.G(uprVar, new int[]{R.layout.conversation_compose_message_placeholder});
        cqoh cqohVar3 = (cqoh) uqjVar.a.b();
        cqohVar3.getClass();
        ekyo ekyoVar = (ekyo) uqjVar.b.b();
        ekyoVar.getClass();
        uqi uqiVar = new uqi(cqohVar3, ekyoVar, czicVar);
        this.b = uqiVar;
        cxqdVar.G(uqiVar, new int[]{R.layout.conversation_suggestions_view});
        uws uwsVar = new uws(linearLayoutManager, czicVar, cqohVar);
        this.g = uwsVar;
        cxqdVar.G(uwsVar, new int[]{R.layout.conversation_typing_indicator});
        if (((Boolean) cnvu.a.e()).booleanValue()) {
            Optional map = optional.map(new Function() { // from class: upu
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    akpw akpwVar = (akpw) obj;
                    ellq ellqVar = (ellq) akpwVar.a.b();
                    ellqVar.getClass();
                    bcsf bcsfVar = (bcsf) akpwVar.b.b();
                    bcsfVar.getClass();
                    return new akpx(ellqVar, bcsfVar, czic.this, cqohVar);
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            this.a = map;
            map.ifPresent(new Consumer() { // from class: upv
                @Override // java.util.function.Consumer
                /* renamed from: accept */
                public final void o(Object obj) {
                    akpv akpvVar = (akpv) obj;
                    upx.this.f.G(akpvVar, akpvVar.J());
                }

                public final /* synthetic */ Consumer andThen(Consumer consumer) {
                    return Consumer$CC.$default$andThen(this, consumer);
                }
            });
        } else {
            this.a = Optional.empty();
        }
        ura uraVar = new ura((cqoh) uqzVar.a.b(), (vyw) uqzVar.b.b(), (ekyo) uqzVar.c.b(), (uwi) uqzVar.d.b(), context, czicVar, onClickListener, onLongClickListener, uqzVar.e);
        ((vyw) uqzVar.b.b()).c(uraVar);
        uraVar.d = new mz(bcse.class, new uro(uraVar));
        this.c = uraVar;
        cxqdVar.G(uraVar, new int[]{R.layout.conversation_message_view, R.layout.conversation_toolstone, R.layout.conversation_tombstone, true != ((Boolean) ((cfup) czpe.a.get()).e()).booleanValue() ? R.layout.conversation_rich_card_view : R.layout.conversation_rich_card_view2, R.layout.conversation_rich_card_carousel_view});
        upq upqVar = new upq(czicVar, cqohVar);
        this.d = upqVar;
        cxqdVar.G(upqVar, new int[]{R.layout.conversation_start_row_view});
        cxqdVar.B(true);
    }

    @Override // defpackage.ljv
    public final void ff(lkr lkrVar) {
        ura uraVar = this.c;
        uwh uwhVar = uraVar.f;
        if (uwhVar != null) {
            uwhVar.m();
            uwm uwmVar = uwhVar.p;
            if (!((Optional) uwmVar.d.getAndSet(Optional.empty())).isEmpty()) {
                uwmVar.a.getContentResolver().unregisterContentObserver(uwmVar.c);
            }
            if (!uwhVar.j.getAndSet(true)) {
                Context context = uwhVar.b;
                context.getContentResolver().unregisterContentObserver(uwhVar.d);
                uwhVar.g.f(uwhVar.k);
            }
            uraVar.f = null;
        }
        uraVar.i.e(uraVar);
    }

    public final int g(MessageIdType messageIdType) {
        cxqd cxqdVar = this.f;
        ura uraVar = this.c;
        return uraVar.F(messageIdType) + cxqdVar.m(uraVar);
    }

    public final elfl h(MessageIdType messageIdType) {
        return this.c.I(messageIdType);
    }

    public final elfl i(int i) {
        ekzz f;
        elfl e;
        elfl elflVar;
        final uwh uwhVar = this.c.f;
        uwhVar.getClass();
        ekzz f2 = eleg.f("MessageListWindowManager#loadMoreIfNeeded");
        try {
            csix.g();
            boolean z = i < uwhVar.f.g / 2;
            csjy.d("BugleDataModel", "isPositionCloserToBottom: %s, currentPositionInMessageSortedList: %d, messages size: %d", Boolean.valueOf(z), Integer.valueOf(i), Integer.valueOf(uwhVar.f.g));
            if (z) {
                csjy.c("BugleDataModel", a.h(i, "loadAfterIfNeeded starts at "));
                f = eleg.f("MessageListWindowManager#loadAfterIfNeeded");
                try {
                    csix.g();
                    e = elfo.e(false);
                    if (uwhVar.j.get()) {
                        csjy.c("BugleDataModel", "Bailing for loadAfterIfNeeded because the object is destroyed.");
                    } else if (uwhVar.x) {
                        elfl elflVar2 = uwhVar.y;
                        if (elflVar2 != null && !elflVar2.isDone()) {
                            csjy.c("BugleDataModel", "We are already loading more after, returning the existing future.");
                            e = uwhVar.y;
                        } else if (i > uwhVar.r) {
                            csjy.c("BugleDataModel", "We have enough messages loaded after, no need to load more.");
                        } else {
                            final bcse h = uwhVar.h();
                            if (h == null) {
                                csjy.c("BugleDataModel", "We don't have a reference message to load more, bailing early.");
                            } else {
                                final bdmz bdmzVar = (bdmz) uwhVar.n.b();
                                final int i2 = uwhVar.s;
                                efbd.c();
                                elfl g = elfo.g(eldl.m(bdmzVar.d(new Callable() { // from class: bdmv
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        List b;
                                        ekzz f3 = eleg.f("MessageListCachedLoader#loadMoreAfter");
                                        int i3 = i2;
                                        bcse bcseVar = h;
                                        bdmz bdmzVar2 = bdmz.this;
                                        try {
                                            bdjk bdjkVar = (bdjk) bdmzVar2.a.b();
                                            ConversationIdType t = bcseVar.t();
                                            MessageIdType u = bcseVar.u();
                                            long i4 = bcseVar.i();
                                            ekzz f4 = eleg.f("ConversationMessageListDatabaseOperations#loadConversationMessagesAfter");
                                            try {
                                                csix.h();
                                                csix.q(i3);
                                                csjb a = bdjk.a.a();
                                                a.I("ConversationMessageListDatabaseOperations loadConversationMessagesAfter starts.");
                                                a.r();
                                                if (bdjkVar.e.a()) {
                                                    bifz b2 = ((bcsy) bdjkVar.d.b()).b(false, blyg.b(t, u, i4, i3));
                                                    b2.z("ConversationMessageDataQueryHelperV2::getConversationMessagesChunkAfterQuery");
                                                    bifu bifuVar = (bifu) b2.b().o();
                                                    try {
                                                        b = bdjk.a(bdjkVar.b, bifuVar);
                                                        bifuVar.close();
                                                    } finally {
                                                    }
                                                } else {
                                                    bjjd bjjdVar = (bjjd) ((bcsq) bdjkVar.c.b()).c(false, blyg.b(t, u, i4, i3)).b().o();
                                                    try {
                                                        b = bdjk.b(bdjkVar.b, bjjdVar);
                                                        bjjdVar.close();
                                                    } finally {
                                                    }
                                                }
                                                f4.close();
                                                List list = (List) Collection.EL.stream(b).map(new bdmt(bdmzVar2)).collect(Collectors.toCollection(new bdmu()));
                                                f3.close();
                                                return list;
                                            } finally {
                                            }
                                        } catch (Throwable th) {
                                            try {
                                                f3.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                            throw th;
                                        }
                                    }
                                })), bdmzVar.e());
                                emwl emwlVar = new emwl() { // from class: uvz
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj) {
                                        uwh uwhVar2 = uwh.this;
                                        List list = (List) obj;
                                        boolean o = uwh.o(list, uwhVar2.s);
                                        bcse bcseVar = h;
                                        if (o) {
                                            csjy.j("BugleDataModel", "We reached the end for load more after %s. Set thereIsDataAfter false.", bcseVar.u());
                                            uwhVar2.x = false;
                                        }
                                        if (list == null || list.isEmpty()) {
                                            csjy.j("BugleDataModel", "No results returned for load more after %s.", bcseVar.u());
                                            return true;
                                        }
                                        csjy.i("BugleDataModel", list.size() + " results retrieved for load more after " + String.valueOf(bcseVar.u()));
                                        uwhVar2.k(list, (bcse) list.get(list.size() + (-1)));
                                        uwhVar2.y = null;
                                        return true;
                                    }
                                };
                                Handler handler = cslq.a;
                                uwhVar.y = g.h(emwlVar, new cslp());
                                e = uwhVar.y;
                            }
                        }
                    } else {
                        csjy.c("BugleDataModel", "Bailing for loadAfterIfNeeded because there is no more data to be loaded.");
                    }
                    f.close();
                    f2.b(e);
                } finally {
                }
            } else {
                csjy.c("BugleDataModel", a.h(i, "loadBeforeIfNeeded starts at "));
                f = eleg.f("MessageListWindowManager#loadBeforeIfNeeded");
                try {
                    csix.g();
                    e = elfo.e(false);
                    if (uwhVar.j.get()) {
                        csjy.c("BugleDataModel", "Bailing for loadBeforeIfNeeded because the object is destroyed.");
                    } else if (uwhVar.v) {
                        elfl elflVar3 = uwhVar.w;
                        if (elflVar3 != null && !elflVar3.isDone()) {
                            csjy.c("BugleDataModel", "loadBeforeFuture is Done. We are already loading more before.");
                            elflVar = uwhVar.w;
                        } else if (i < uwhVar.f.g - uwhVar.r) {
                            csjy.c("BugleDataModel", "We are have enough messages loaded before, no need to load more.");
                        } else {
                            final bcse i3 = uwhVar.i();
                            if (i3 == null) {
                                csjy.c("BugleDataModel", "We don't have a reference message to load more, bailing early.");
                            } else {
                                final bdmz bdmzVar2 = (bdmz) uwhVar.n.b();
                                final int i4 = uwhVar.s;
                                efbd.c();
                                elfl g2 = elfo.g(eldl.m(bdmzVar2.d(new Callable() { // from class: bdmx
                                    @Override // java.util.concurrent.Callable
                                    public final Object call() {
                                        List b;
                                        ekzz f3 = eleg.f("MessageListCachedLoader#loadMoreBefore");
                                        int i5 = i4;
                                        bcse bcseVar = i3;
                                        bdmz bdmzVar3 = bdmz.this;
                                        try {
                                            bdjk bdjkVar = (bdjk) bdmzVar3.a.b();
                                            ConversationIdType t = bcseVar.t();
                                            MessageIdType u = bcseVar.u();
                                            long i6 = bcseVar.i();
                                            ekzz f4 = eleg.f("ConversationMessageListDatabaseOperations#loadConversationMessagesBefore");
                                            try {
                                                csix.h();
                                                csix.q(i5);
                                                csjb a = bdjk.a.a();
                                                a.I("ConversationMessageListDatabaseOperations loadConversationMessagesBefore starts.");
                                                a.r();
                                                if (bdjkVar.e.a()) {
                                                    bifz b2 = ((bcsy) bdjkVar.d.b()).b(false, blyg.c(t, u, i6, i5));
                                                    b2.z("ConversationMessageDataQueryHelperV2::getConversationMessagesChunkBeforeQuery");
                                                    bifu bifuVar = (bifu) b2.b().o();
                                                    try {
                                                        b = bdjk.a(bdjkVar.b, bifuVar);
                                                        bifuVar.close();
                                                    } finally {
                                                    }
                                                } else {
                                                    bjjd bjjdVar = (bjjd) ((bcsq) bdjkVar.c.b()).c(false, blyg.c(t, u, i6, i5)).b().o();
                                                    try {
                                                        b = bdjk.b(bdjkVar.b, bjjdVar);
                                                        bjjdVar.close();
                                                    } finally {
                                                    }
                                                }
                                                f4.close();
                                                List list = (List) Collection.EL.stream(b).map(new bdmt(bdmzVar3)).collect(Collectors.toCollection(new bdmu()));
                                                f3.close();
                                                return list;
                                            } finally {
                                            }
                                        } catch (Throwable th) {
                                            try {
                                                f3.close();
                                            } catch (Throwable th2) {
                                                th.addSuppressed(th2);
                                            }
                                            throw th;
                                        }
                                    }
                                })), bdmzVar2.e());
                                emwl emwlVar2 = new emwl() { // from class: uwd
                                    @Override // defpackage.emwl
                                    public final Object apply(Object obj) {
                                        uwh uwhVar2 = uwh.this;
                                        List list = (List) obj;
                                        boolean o = uwh.o(list, uwhVar2.s);
                                        bcse bcseVar = i3;
                                        if (o) {
                                            csjy.j("BugleDataModel", "We reached the end for load more before %s, set thereIsDataBefore false", bcseVar.u());
                                            uwhVar2.v = false;
                                        }
                                        if (list == null || list.isEmpty()) {
                                            csjy.j("BugleDataModel", "No results returned for load more before %s", bcseVar.u());
                                            return true;
                                        }
                                        csjy.i("BugleDataModel", list.size() + " results retrieved for load more before " + bcseVar.u().b());
                                        uwhVar2.k(list, (bcse) list.get(0));
                                        uwhVar2.w = null;
                                        return true;
                                    }
                                };
                                Handler handler2 = cslq.a;
                                uwhVar.w = g2.h(emwlVar2, new cslp());
                                elflVar = uwhVar.w;
                                f.b(elflVar);
                            }
                        }
                        f.close();
                        e = elflVar;
                        f2.b(e);
                    } else {
                        csjy.c("BugleDataModel", "Bailing for loadBeforeIfNeeded because there is no more data to be loaded.");
                    }
                    f.close();
                    f2.b(e);
                } finally {
                }
            }
            f2.close();
            return elfl.g(e);
        } catch (Throwable th) {
            try {
                f2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void j(boolean z, boolean z2) {
        ura uraVar = this.c;
        if (uraVar.h != z) {
            uraVar.h = z;
            if (z2) {
                uraVar.p();
            }
        }
    }

    public final void k(int i) {
        upr uprVar = this.e;
        if (uprVar.d == i || !uprVar.a) {
            return;
        }
        uprVar.d = i;
        uprVar.q(0);
        uprVar.e.u();
    }

    public final void l(List list) {
        csix.g();
        csix.l(list);
        uws uwsVar = this.g;
        if (uwsVar.f.size() == list.size() && uwsVar.f.containsAll(list)) {
            return;
        }
        uwsVar.f = list;
        if (uwsVar.f.isEmpty() && uwsVar.a) {
            uwsVar.a = false;
            uwsVar.y(0);
        } else {
            if (uwsVar.f.isEmpty() || uwsVar.a) {
                uwsVar.q(0);
                return;
            }
            uwsVar.a = true;
            uwsVar.s(0);
            if (uwsVar.d.K() == 0) {
                uwsVar.d.ab(0);
            }
        }
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void c(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void d(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void f(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void gZ(lkr lkrVar) {
    }

    @Override // defpackage.ljv
    public final /* synthetic */ void ha(lkr lkrVar) {
    }
}
