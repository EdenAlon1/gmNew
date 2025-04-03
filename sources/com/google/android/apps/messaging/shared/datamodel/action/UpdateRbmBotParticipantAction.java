package com.google.android.apps.messaging.shared.datamodel.action;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.android.apps.messaging.shared.datamodel.action.UpdateRbmBotParticipantAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.ParticipantColor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;
import defpackage.bbaq;
import defpackage.bbar;
import defpackage.bbcg;
import defpackage.bczy;
import defpackage.bdrr;
import defpackage.cbgf;
import defpackage.dtuu;
import defpackage.ekzz;
import defpackage.eleg;
import defpackage.eogt;
import defpackage.ffbr;
import j$.util.function.Function$CC;
import java.util.function.Function;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class UpdateRbmBotParticipantAction extends Action<Void> implements Parcelable {
    public static final Parcelable.Creator<Action<Void>> CREATOR = new bbaq();
    public final ffbr a;
    public final dtuu b;
    private final ffbr c;
    private final cbgf d;

    /* compiled from: PG */
    public interface a {
        bbar iv();
    }

    public UpdateRbmBotParticipantAction(ffbr ffbrVar, ffbr ffbrVar2, cbgf cbgfVar, dtuu dtuuVar, Parcel parcel) {
        super(parcel, eogt.UPDATE_RBM_BOT_PARTICIPANT_ACTION);
        this.a = ffbrVar;
        this.c = ffbrVar2;
        this.d = cbgfVar;
        this.b = dtuuVar;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final ekzz a() {
        return eleg.f("UpdateRbmBotParticipantAction");
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final /* bridge */ /* synthetic */ Object b() {
        bbcg bbcgVar = this.t;
        String l = bbcgVar.l("rbmBotId");
        final String l2 = bbcgVar.l("updatedName");
        final ParticipantColor b = ParticipantColor.b(bbcgVar.l("updatedColor"));
        final ParticipantsTable.BindData d = ((bdrr) this.a.b()).d(l);
        d.getClass();
        final String S = d.S();
        if (TextUtils.equals(d.P(), l2) && d.m() == b.c) {
            return null;
        }
        this.b.d("UpdateRbmBotParticipantAction.executeAction", new Runnable() { // from class: bbap
            @Override // java.lang.Runnable
            public final void run() {
                final UpdateRbmBotParticipantAction updateRbmBotParticipantAction = UpdateRbmBotParticipantAction.this;
                final String str = l2;
                final ParticipantsTable.BindData bindData = d;
                ((Boolean) updateRbmBotParticipantAction.b.c("UpdateRbmBotParticipantAction#updateParticipantDisplayDestination", new emyl() { // from class: bban
                    @Override // defpackage.emyl
                    public final Object get() {
                        bvvr f = ParticipantsTable.f();
                        f.ap("updateParticipantDisplayDestination");
                        f.r(str);
                        final ParticipantsTable.BindData bindData2 = bindData;
                        f.V(new Function() { // from class: bbao
                            @Override // java.util.function.Function
                            /* renamed from: andThen */
                            public final /* synthetic */ Function mo448andThen(Function function) {
                                return Function$CC.$default$andThen(this, function);
                            }

                            @Override // java.util.function.Function
                            public final Object apply(Object obj) {
                                bvvw bvvwVar = (bvvw) obj;
                                Parcelable.Creator<Action<Void>> creator = UpdateRbmBotParticipantAction.CREATOR;
                                bvvwVar.r(ParticipantsTable.BindData.this.U());
                                return bvvwVar;
                            }

                            public final /* synthetic */ Function compose(Function function) {
                                return Function$CC.$default$compose(this, function);
                            }
                        });
                        int e = f.b().e();
                        ((bdrr) UpdateRbmBotParticipantAction.this.a.b()).p(e, e != 1 ? "Failed to update participant's display destination." : "Successfully updated participants's display destination.");
                        return Boolean.valueOf(e == 1);
                    }
                })).booleanValue();
                ((bdrr) updateRbmBotParticipantAction.a.b()).q(S, b);
            }
        });
        ((bczy) this.c.b()).R(S);
        this.d.b();
        return null;
    }

    @Override // com.google.android.apps.messaging.shared.datamodel.action.common.Action
    public final String c() {
        return "Bugle.DataModel.Action.UpdateRbmBotParticipant.ExecuteAction.Latency";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        D(parcel, i);
    }
}
