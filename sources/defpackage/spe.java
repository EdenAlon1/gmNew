package defpackage;

import android.os.ParcelFileDescriptor;
import com.android.vcard.VCardConfig;
import java.io.File;
import java.io.FileNotFoundException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class spe extends ffhv implements ffjm {
    final /* synthetic */ ffkx a;
    final /* synthetic */ spw b;
    final /* synthetic */ eyee c;
    final /* synthetic */ fdyn d;
    private /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public spe(ffgu ffguVar, ffkx ffkxVar, spw spwVar, eyee eyeeVar, fdyn fdynVar) {
        super(2, ffguVar);
        this.a = ffkxVar;
        this.b = spwVar;
        this.c = eyeeVar;
        this.d = fdynVar;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((spe) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        boolean z;
        snw snwVar;
        File a;
        ffci.b(obj);
        try {
            spw spwVar = this.b;
            snwVar = spwVar.d;
            a = snwVar.a.a(spwVar.j.a() ? cqjf.b(this.c) : null);
        } catch (sqq e) {
            ((ensz) ((ensz) this.b.k.j()).g(e)).q("Failed to back up item");
            z = false;
        }
        if (a == null) {
            ((ensz) snwVar.b.j()).q("Backup database copy file is null");
            throw new sqq("Backup database copy file is null");
        }
        try {
            ParcelFileDescriptor open = ParcelFileDescriptor.open(a, VCardConfig.FLAG_REFRAIN_QP_TO_NAME_PROPERTIES);
            open.getClass();
            evhd evhdVar = dfiv.a;
            evhdVar.getClass();
            evhe.a(evhdVar, open, this.d);
            z = true;
            this.a.a = z;
            return ffcu.a;
        } catch (FileNotFoundException e2) {
            ((ensz) ((ensz) snwVar.b.j()).g(e2)).q("File not found when opening file descriptor for backup database");
            throw new sqq("File not found when opening file descriptor for backup database", e2);
        }
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        spe speVar = new spe(ffguVar, this.a, this.b, this.c, this.d);
        speVar.e = obj;
        return speVar;
    }
}
