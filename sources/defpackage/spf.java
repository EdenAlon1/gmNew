package defpackage;

import android.net.Uri;
import android.os.ParcelFileDescriptor;
import com.google.android.apps.messaging.shared.datamodel.databasegen.tabledefinitions.PartsTable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spf extends ffhv implements ffjm {
    final /* synthetic */ ffkx a;
    final /* synthetic */ spw b;
    final /* synthetic */ sny c;
    final /* synthetic */ fdyn d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spf(ffgu ffguVar, ffkx ffkxVar, spw spwVar, sny snyVar, fdyn fdynVar) {
        super(2, ffguVar);
        this.a = ffkxVar;
        this.b = spwVar;
        this.c = snyVar;
        this.d = fdynVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((spf) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        boolean z;
        snw snwVar;
        String valueOf;
        PartsTable.BindData a;
        ffci.b(obj);
        try {
            snwVar = this.b.d;
            valueOf = String.valueOf(this.c.a);
            a = PartsTable.a(valueOf);
        } catch (sqq e) {
            ensz enszVar = (ensz) ((ensz) this.b.k.j()).g(e);
            enszVar.aa(ensy.FULL);
            enszVar.q("Failed to back up item");
            z = false;
        }
        if (a == null) {
            ensz enszVar2 = (ensz) snwVar.b.j();
            enszVar2.Y(csux.s, valueOf);
            enszVar2.q("Unable to find part id for backup attachment");
            throw new sqq("Unable to find part id for backup attachment");
        }
        Uri t = a.t();
        if (t == null) {
            ensz enszVar3 = (ensz) snwVar.b.j();
            enszVar3.Y(csux.s, valueOf);
            enszVar3.q("Uri is null for backup attachment");
            throw new sqq("Uri is null for backup attachment");
        }
        ParcelFileDescriptor a2 = snwVar.a(t, valueOf, snwVar.b(t));
        evhd evhdVar = dfiv.a;
        evhdVar.getClass();
        evhe.a(evhdVar, a2, this.d);
        z = true;
        this.a.a = z;
        return ffcu.a;
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        spf spfVar = new spf(ffguVar, this.a, this.b, this.c, this.d);
        spfVar.e = obj;
        return spfVar;
    }
}
