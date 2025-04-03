package defpackage;

import android.os.Parcel;
import com.google.android.apps.messaging.shared.api.messaging.selfidentity.SelfIdentityId;
import com.google.android.apps.messaging.shared.datamodel.action.InsertNewMessageAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.Action;
import com.google.android.apps.messaging.shared.datamodel.data.common.DeviceData;
import com.google.android.apps.messaging.shared.datamodel.data.common.MessageCoreData;
import com.google.android.apps.messaging.shared.datamodel.data.datatypes.ConversationIdType;
import j$.util.Optional;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bagj extends bbfb {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;
    private final ffbr h;
    private final ffbr i;
    private final ffbr j;
    private final ffbr k;
    private final ffbr l;

    public bagj(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7, ffbr ffbrVar8, ffbr ffbrVar9, ffbr ffbrVar10, ffbr ffbrVar11, ffbr ffbrVar12) {
        ffbrVar.getClass();
        this.a = ffbrVar;
        ffbrVar2.getClass();
        this.b = ffbrVar2;
        ffbrVar3.getClass();
        this.c = ffbrVar3;
        ffbrVar4.getClass();
        this.d = ffbrVar4;
        ffbrVar5.getClass();
        this.e = ffbrVar5;
        ffbrVar6.getClass();
        this.f = ffbrVar6;
        ffbrVar7.getClass();
        this.g = ffbrVar7;
        ffbrVar8.getClass();
        this.h = ffbrVar8;
        ffbrVar9.getClass();
        this.i = ffbrVar9;
        ffbrVar10.getClass();
        this.j = ffbrVar10;
        ffbrVar11.getClass();
        this.k = ffbrVar11;
        ffbrVar12.getClass();
        this.l = ffbrVar12;
    }

    @Override // defpackage.bbfb
    public final /* bridge */ /* synthetic */ Action a(MessageCoreData messageCoreData, boolean z, eooi eooiVar, byyt byytVar, int i, Optional optional, long j, boolean z2) {
        dtuu dtuuVar = (dtuu) this.c.b();
        dtuuVar.getClass();
        aolr aolrVar = (aolr) this.d.b();
        aolrVar.getClass();
        cipm cipmVar = (cipm) this.e.b();
        cipmVar.getClass();
        bagi bagiVar = (bagi) this.h.b();
        bagiVar.getClass();
        ((asqi) this.k.b()).getClass();
        augw augwVar = (augw) this.l.b();
        augwVar.getClass();
        messageCoreData.getClass();
        ffbr ffbrVar = this.i;
        ffbr ffbrVar2 = this.j;
        return new InsertNewMessageAction(this.a, this.b, dtuuVar, aolrVar, cipmVar, this.f, this.g, bagiVar, ffbrVar, ffbrVar2, augwVar, messageCoreData, z, eooiVar, byytVar, i, optional, j, z2);
    }

    @Override // defpackage.bbfb
    public final /* bridge */ /* synthetic */ Action b(int i, engw engwVar, String str, String str2, ConversationIdType conversationIdType, SelfIdentityId selfIdentityId, boolean z, boolean z2, eooi eooiVar, DeviceData deviceData, boolean z3, ArrayList arrayList, boolean z4, fjay fjayVar) {
        dtuu dtuuVar = (dtuu) this.c.b();
        dtuuVar.getClass();
        aolr aolrVar = (aolr) this.d.b();
        aolrVar.getClass();
        cipm cipmVar = (cipm) this.e.b();
        cipmVar.getClass();
        bagi bagiVar = (bagi) this.h.b();
        bagiVar.getClass();
        ((asqi) this.k.b()).getClass();
        augw augwVar = (augw) this.l.b();
        augwVar.getClass();
        engwVar.getClass();
        eooiVar.getClass();
        ffbr ffbrVar = this.i;
        ffbr ffbrVar2 = this.j;
        return new InsertNewMessageAction(this.a, this.b, dtuuVar, aolrVar, cipmVar, this.f, this.g, bagiVar, ffbrVar, ffbrVar2, augwVar, i, engwVar, str, str2, conversationIdType, selfIdentityId, z, z2, eooiVar, deviceData, z3, arrayList, z4, fjayVar);
    }

    @Override // defpackage.bbck
    public final /* bridge */ /* synthetic */ Action c(Parcel parcel) {
        dtuu dtuuVar = (dtuu) this.c.b();
        dtuuVar.getClass();
        aolr aolrVar = (aolr) this.d.b();
        aolrVar.getClass();
        cipm cipmVar = (cipm) this.e.b();
        cipmVar.getClass();
        bagi bagiVar = (bagi) this.h.b();
        bagiVar.getClass();
        ((asqi) this.k.b()).getClass();
        augw augwVar = (augw) this.l.b();
        augwVar.getClass();
        parcel.getClass();
        ffbr ffbrVar = this.i;
        ffbr ffbrVar2 = this.j;
        return new InsertNewMessageAction(this.a, this.b, dtuuVar, aolrVar, cipmVar, this.f, this.g, bagiVar, ffbrVar, ffbrVar2, augwVar, parcel);
    }
}
