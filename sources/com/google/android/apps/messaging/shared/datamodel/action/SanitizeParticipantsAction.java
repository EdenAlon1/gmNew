package com.google.android.apps.messaging.shared.datamodel.action;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.telephony.PhoneNumberUtils;
import com.google.android.apps.messaging.shared.datamodel.action.SanitizeParticipantsAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import defpackage.bavw;
import defpackage.bbgd;
import defpackage.bdrr;
import defpackage.bdrv;
import defpackage.bdtd;
import defpackage.bvpo;
import defpackage.dtuu;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.engr;
import defpackage.engw;
import defpackage.enou;
import defpackage.eogt;
import defpackage.ffbr;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class SanitizeParticipantsAction extends Action<engw<ParticipantsTable.BindData>> implements Parcelable {
    public static final Parcelable.Creator<Action<engw<ParticipantsTable.BindData>>> CREATOR = new bavw();
    public final ffbr a;
    public final ffbr b;
    public final dtuu c;
    private final Context d;

    /* compiled from: PG */
    public interface a {
        bbgd br();
    }

    public SanitizeParticipantsAction(Context context, ffbr<bdrr> ffbrVar, ffbr<bdrv> ffbrVar2, dtuu dtuuVar) {
        super(eogt.SANITIZE_PARTICIPANTS_ACTION);
        this.d = context;
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = dtuuVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("SanitizeParticipantsAction");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* synthetic */ Object b() {
        int i = engw.d;
        engr engrVar = new engr();
        engw g = ((bdrr) this.a.b()).g();
        int i2 = ((enou) g).c;
        for (int i3 = 0; i3 < i2; i3++) {
            ParticipantsTable.BindData bindData = (ParticipantsTable.BindData) g.get(i3);
            if (!bdtd.m(bindData) && !PhoneNumberUtils.compare(this.d, bindData.U(), bindData.W())) {
                engrVar.h(bindData);
            } else if (!bindData.U().startsWith("+") && bindData.W().startsWith("+")) {
                bvpo C = bindData.C();
                C.I(bindData.W());
                engrVar.h(C.a());
            }
        }
        final engw g2 = engrVar.g();
        if (!g2.isEmpty()) {
            this.c.d("SanitizeParticipantsAction#sanitizeParticipants", new Runnable() { // from class: bavv
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.lang.Runnable
                public final void run() {
                    int i4 = 0;
                    while (true) {
                        engw engwVar = g2;
                        if (i4 >= ((enou) engwVar).c) {
                            return;
                        }
                        final SanitizeParticipantsAction sanitizeParticipantsAction = SanitizeParticipantsAction.this;
                        final ParticipantsTable.BindData bindData2 = (ParticipantsTable.BindData) engwVar.get(i4);
                        sanitizeParticipantsAction.c.d("SanitizeParticipantsAction#sanitizeParticipant", new Runnable() { // from class: bavt
                            @Override // java.lang.Runnable
                            public final void run() {
                                bvvr f = ParticipantsTable.f();
                                f.al();
                                f.ap("sanitizeParticipant");
                                final ParticipantsTable.BindData bindData3 = bindData2;
                                f.C(bindData3.T());
                                f.n(bindData3.u());
                                f.v(bindData3.R());
                                f.t(bindData3.Q());
                                f.M(bindData3.x());
                                f.H(bindData3.U());
                                f.O(bindData3.W());
                                f.l(bindData3.N());
                                f.V(new Function() { // from class: bavu
                                    @Override // java.util.function.Function
                                    /* renamed from: andThen */
                                    public final /* synthetic */ Function mo448andThen(Function function) {
                                        return Function$CC.$default$andThen(this, function);
                                    }

                                    @Override // java.util.function.Function
                                    public final Object apply(Object obj) {
                                        bvvw bvvwVar = (bvvw) obj;
                                        Parcelable.Creator<Action<engw<ParticipantsTable.BindData>>> creator = SanitizeParticipantsAction.CREATOR;
                                        bvvwVar.w(-2);
                                        bvvwVar.k(ParticipantsTable.BindData.this.S());
                                        return bvvwVar;
                                    }

                                    public final /* synthetic */ Function compose(Function function) {
                                        return Function$CC.$default$compose(this, function);
                                    }
                                });
                                f.F(bindData3.F());
                                f.J(bindData3.G());
                                bdqo.a(bindData3).c(f);
                                boolean booleanValue = ((Boolean) ((cfup) bdrs.b.get()).e()).booleanValue();
                                SanitizeParticipantsAction sanitizeParticipantsAction2 = SanitizeParticipantsAction.this;
                                int b = booleanValue ? ((bdrv) sanitizeParticipantsAction2.b.b()).b(f, bdsp.e) : ((Boolean) ((cfup) bdrs.a.get()).e()).booleanValue() ? ((bdrv) sanitizeParticipantsAction2.b.b()).a(f.b()) : f.b().a().size();
                                ((bdrr) sanitizeParticipantsAction2.a.b()).p(b, b != 1 ? "Failed to sanitize participant." : "Successfully sanitized participants.");
                            }
                        });
                        i4++;
                    }
                }
            });
        }
        return g2;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.SanitizeParticipants.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }

    public SanitizeParticipantsAction(Context context, ffbr<bdrr> ffbrVar, ffbr<bdrv> ffbrVar2, dtuu dtuuVar, Parcel parcel) {
        super(parcel, eogt.SANITIZE_PARTICIPANTS_ACTION);
        this.d = context;
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = dtuuVar;
    }
}
