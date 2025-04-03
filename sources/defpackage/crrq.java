package defpackage;

import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.ParticipantsTable;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class crrq implements bdqg {
    public final ffbr a;
    public final ffbr b;
    private final ffbr c;
    private final ffsk d;

    public crrq(ffbr ffbrVar, ffbr ffbrVar2, ffbr ffbrVar3, ffsk ffskVar) {
        ffbrVar.getClass();
        ffbrVar2.getClass();
        ffbrVar3.getClass();
        ffskVar.getClass();
        this.a = ffbrVar;
        this.b = ffbrVar2;
        this.c = ffbrVar3;
        this.d = ffskVar;
    }

    @Override // defpackage.bdqg
    public final ekzz a() {
        return eleg.f("UpdateBlockStatusOnParticipantInsertedListener#afterParticipantInserted");
    }

    @Override // defpackage.bdqg
    public final void b(String str) {
        if (((dtuu) this.c.b()).i()) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        axol.k(this.d, null, new crrp(this, str, null), 3);
    }

    @Override // defpackage.bdqg
    public final /* synthetic */ void c(String str, ParticipantsTable.BindData bindData, boolean z) {
        b(str);
    }
}
