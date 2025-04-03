package defpackage;

import android.content.Context;
import android.os.Parcel;
import com.google.android.apps.messaging.shared.datamodel.action.GenericWorkerQueueAction;
import com.google.android.apps.messaging.shared.datamodel.action.common.ThrottledAction;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bafi implements bbck {
    private final ffbr a;
    private final ffbr b;
    private final ffbr c;
    private final ffbr d;
    private final ffbr e;
    private final ffbr f;
    private final ffbr g;

    public bafi(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffbr ffbrVar4, ffbr ffbrVar5, ffbr ffbrVar6, ffbr ffbrVar7) {
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
        this.f = ffbrVar6;
        this.g = ffbrVar7;
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [fazb, java.lang.Object] */
    @Override // defpackage.bbck
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final GenericWorkerQueueAction c(Parcel parcel) {
        Context context = (Context) this.a.b();
        context.getClass();
        cbym cbymVar = (cbym) this.d.b();
        cbymVar.getClass();
        errl errlVar = (errl) this.e.b();
        errlVar.getClass();
        ?? b = this.f.b();
        b.getClass();
        cqoh cqohVar = (cqoh) this.g.b();
        cqohVar.getClass();
        parcel.getClass();
        return new GenericWorkerQueueAction(context, this.b, this.c, cbymVar, errlVar, b, cqohVar, parcel);
    }

    /* JADX WARN: Type inference failed for: r7v0, types: [fazb, java.lang.Object] */
    public final /* bridge */ /* synthetic */ ThrottledAction b() {
        Context context = (Context) this.a.b();
        context.getClass();
        cbym cbymVar = (cbym) this.d.b();
        cbymVar.getClass();
        errl errlVar = (errl) this.e.b();
        errlVar.getClass();
        ?? b = this.f.b();
        b.getClass();
        cqoh cqohVar = (cqoh) this.g.b();
        cqohVar.getClass();
        return new GenericWorkerQueueAction(context, this.b, this.c, cbymVar, errlVar, b, cqohVar);
    }
}
