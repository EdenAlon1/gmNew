package defpackage;

import android.net.Uri;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import j$.util.Optional;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class awnh extends ffhv implements ffjm {
    int a;
    final /* synthetic */ awnk b;
    final /* synthetic */ awkh c;
    final /* synthetic */ awwc d;
    final /* synthetic */ Uri e;
    private /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public awnh(ffgu ffguVar, awnk awnkVar, awkh awkhVar, awwc awwcVar, Uri uri) {
        super(2, ffguVar);
        this.b = awnkVar;
        this.c = awkhVar;
        this.d = awwcVar;
        this.e = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((awnh) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ParticipantsTable.BindData bindData;
        ffhh ffhhVar = ffhh.a;
        int i = this.a;
        ffci.b(obj);
        if (i != 0) {
            return obj;
        }
        ((bczy) this.b.a.b()).P(this.c.f());
        final cbvt cbvtVar = (cbvt) this.b.b.b();
        awkh awkhVar = this.c;
        awwc awwcVar = this.d;
        final ConversationIdType f = awkhVar.f();
        awxf awxfVar = awwcVar.e;
        if (awxfVar == null) {
            awxfVar = awxf.a;
        }
        final awui awuiVar = awxfVar.c;
        if (awuiVar == null) {
            awuiVar = awui.a;
        }
        awuiVar.getClass();
        String str = awuiVar.d;
        str.getClass();
        if (str.length() == 0) {
            bindData = null;
        } else {
            bvvn e = ParticipantsTable.e();
            e.z("RcsGroupIconUpdater.getOriginatorParticipant");
            e.h(new Function() { // from class: awng
                @Override // java.util.function.Function
                /* renamed from: andThen */
                public final /* synthetic */ Function mo448andThen(Function function) {
                    return Function$CC.$default$andThen(this, function);
                }

                @Override // java.util.function.Function
                public final Object apply(Object obj2) {
                    bvvw bvvwVar = (bvvw) obj2;
                    bvvwVar.r(awui.this.d);
                    return bvvwVar;
                }

                public final /* synthetic */ Function compose(Function function) {
                    return Function$CC.$default$compose(this, function);
                }
            });
            e.d(new bvvk(ParticipantsTable.c.d, false));
            e.x(1);
            bindData = (ParticipantsTable.BindData) ((bvti) e.b().o()).cS();
        }
        final ParticipantsTable.BindData bindData2 = bindData;
        awkh awkhVar2 = this.c;
        Uri uri = this.e;
        SelfIdentityId b = awkhVar2.b();
        final aztg e2 = awkhVar2.e();
        final int i2 = true != ffkj.e(uri, Uri.EMPTY) ? 260 : 261;
        elfl h = ((aqvh) cbvtVar.m.b()).d(b).h(new emwl() { // from class: cbvg
            @Override // defpackage.emwl
            public final Object apply(Object obj2) {
                final Optional optional = (Optional) obj2;
                final ConversationIdType conversationIdType = f;
                final aztg aztgVar = e2;
                final ParticipantsTable.BindData bindData3 = bindData2;
                final cbvt cbvtVar2 = cbvt.this;
                final int i3 = i2;
                cbvtVar2.j.d("TombstoneInserter#insertRcsGroupIconTombstone", new Runnable() { // from class: cbvi
                    @Override // java.lang.Runnable
                    public final void run() {
                        engw engwVar;
                        aztg aztgVar2 = aztgVar;
                        ParticipantsTable.BindData bindData4 = bindData3;
                        ParticipantsTable.BindData a = bindData4 != null ? bindData4 : aztgVar2.a();
                        if (bindData4 != null) {
                            engwVar = engw.r(bindData4);
                        } else {
                            int i4 = engw.d;
                            engwVar = enou.a;
                        }
                        engw engwVar2 = engwVar;
                        int i5 = i3;
                        ConversationIdType conversationIdType2 = conversationIdType;
                        Optional optional2 = optional;
                        cbvt cbvtVar3 = cbvt.this;
                        cbvtVar3.k(optional2, conversationIdType2, aztgVar2, a, engwVar2, i5, cbvtVar3.f.f().toEpochMilli(), -1L, null);
                    }
                });
                return null;
            }
        }, cbvtVar.n);
        this.a = 1;
        Object c = fgfz.c(h, this);
        return c == ffhhVar ? ffhhVar : c;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        awnh awnhVar = new awnh(ffguVar, this.b, this.c, this.d, this.e);
        awnhVar.f = obj;
        return awnhVar;
    }
}
