package defpackage;

import android.net.Uri;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

/* compiled from: PG */
/* loaded from: classes6.dex */
public final class bami extends ffhv implements ffjm {
    final /* synthetic */ bamw a;
    final /* synthetic */ Uri b;
    private /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bami(ffgu ffguVar, bamw bamwVar, Uri uri) {
        super(2, ffguVar);
        this.a = bamwVar;
        this.b = uri;
    }

    @Override // defpackage.ffjm
    public final /* bridge */ /* synthetic */ Object a(Object obj, Object obj2) {
        return ((bami) c((ffsk) obj, (ffgu) obj2)).b(ffcu.a);
    }

    @Override // defpackage.ffhp
    public final Object b(Object obj) {
        ffci.b(obj);
        File e = cbgk.e(this.a.c, this.b);
        long j = 0;
        byte[] bArr = null;
        if (e != null) {
            try {
                bArr = eoeo.b(e);
            } catch (FileNotFoundException e2) {
                csjb b = bamw.a.b();
                b.I("MMS download file not found:");
                b.I(e);
                b.s(e2);
            } catch (IOException e3) {
                csjb b2 = bamw.a.b();
                b2.I("Error reading MMS download file:");
                b2.I(e);
                b2.s(e3);
            }
        }
        if (bArr != null) {
            j = bArr.length;
        }
        if (e != null && e.exists()) {
            e.delete();
            csjb a = bamw.a.a();
            a.I("Deleted temp file with downloaded MMS pdu:");
            a.I(e);
            a.r();
        }
        return new balx(bArr, j);
    }

    @Override // defpackage.ffhp
    public final ffgu c(Object obj, ffgu ffguVar) {
        bami bamiVar = new bami(ffguVar, this.a, this.b);
        bamiVar.c = obj;
        return bamiVar;
    }
}
