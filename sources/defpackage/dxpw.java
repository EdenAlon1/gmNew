package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxpw implements dxpq {
    private final Context a;
    private final dwxf b;
    private final emxc c;
    private final dwqy d;

    public dxpw(Context context, dwxf dwxfVar, emxc emxcVar, dwqy dwqyVar) {
        this.a = context;
        this.b = dwxfVar;
        this.c = emxcVar;
        this.d = dwqyVar;
    }

    @Override // defpackage.dxpq
    public final ListenableFuture a() {
        dxvw.a(this.a, "gms_icing_mdd_shared_files", this.c).edit().clear().commit();
        return erqt.i(null);
    }

    @Override // defpackage.dxpq
    public final ListenableFuture c() {
        ArrayList arrayList = new ArrayList();
        SharedPreferences a = dxvw.a(this.a, "gms_icing_mdd_shared_files", this.c);
        SharedPreferences.Editor editor = null;
        for (String str : a.getAll().keySet()) {
            try {
                arrayList.add(dxvv.a(str, this.a, this.b));
            } catch (dxvu e) {
                dxth.j(e, "Failed to deserialize newFileKey:".concat(String.valueOf(str)));
                dwxf dwxfVar = this.b;
                emye.d("|").i(str).size();
                dwxfVar.a();
                if (editor == null) {
                    editor = a.edit();
                }
                editor.remove(str);
            }
        }
        if (editor != null) {
            editor.commit();
        }
        return erqt.i(arrayList);
    }

    @Override // defpackage.dxpq
    public final ListenableFuture d() {
        boolean z;
        boolean z2 = false;
        if (!dxkk.c(this.a)) {
            dxth.b("%s Device isn't migrated to new file key, clear and set migration.", "SharedFilesMetadata");
            dxkk.e(this.a);
            dxkk.d(this.a, dxkj.a(this.d.h()));
            return erqt.i(false);
        }
        dxkj a = dxkj.a(this.d.h());
        dxkj a2 = dxkk.a(this.a, this.b);
        int i = a.d;
        int i2 = a2.d;
        int i3 = 1;
        if (i == i2) {
            z2 = true;
        } else {
            int i4 = 2;
            if (i < i2) {
                dxth.i("%s Cannot migrate back from value %s to %s. Clear everything!", "SharedFilesMetadata", a2, a);
                dwxf dwxfVar = this.b;
                new Exception("Downgraded file key from " + String.valueOf(a2) + " to " + String.valueOf(a) + ".");
                dwxfVar.a();
                dxkk.d(this.a, a);
            } else {
                int i5 = i2 + 1;
                while (i5 <= a.d) {
                    try {
                        dxkj a3 = dxkj.a(i5);
                        int ordinal = a3.ordinal();
                        if (ordinal == i3) {
                            z = z2;
                            dxth.b("%s: Starting migration to add download transform", "SharedFilesMetadata");
                            SharedPreferences a4 = dxvw.a(this.a, "gms_icing_mdd_shared_files", this.c);
                            SharedPreferences.Editor edit = a4.edit();
                            for (String str : a4.getAll().keySet()) {
                                try {
                                    dwtt a5 = dxvv.a(str, this.a, this.b);
                                    dwtx dwtxVar = (dwtx) dxvw.c(a4, str, dwtx.a.getParserForType());
                                    if (dwtxVar == null) {
                                        dxth.g("%s: Unable to read sharedFile from shared preferences.", "SharedFilesMetadata");
                                        edit.remove(str);
                                    } else {
                                        dxvw.f(edit, str);
                                        dxvw.g(edit, dxvv.e(a5), dwtxVar);
                                    }
                                } catch (dxvu unused) {
                                    dxth.h("%s Failed to deserialize file key %s, remove and continue.", "SharedFilesMetadata", str);
                                    this.b.a();
                                    edit.remove(str);
                                }
                            }
                            if (!edit.commit()) {
                                dxth.f("Failed to commit migration metadata to disk");
                                dwxf dwxfVar2 = this.b;
                                new Exception("Migrate to DownloadTransform failed.");
                                dwxfVar2.a();
                                if (dxkk.a(this.a, this.b).d != a.d) {
                                    dxth.f(a.F(a, "Failed to commit migration version to disk. Fail to set target version to ", "."));
                                    dwxf dwxfVar3 = this.b;
                                    new Exception(a.F(a, "Fail to set target version ", "."));
                                    dwxfVar3.a();
                                }
                                z2 = z;
                            }
                            dxkk.d(this.a, dxkj.a(i5));
                            i5++;
                            z2 = z;
                            i3 = 1;
                            i4 = 2;
                        } else {
                            if (ordinal != i4) {
                                throw new UnsupportedOperationException("Upgrade to version " + a3.name() + "not supported!");
                            }
                            dxth.b("%s: Starting migration to dedup on checksum only", "SharedFilesMetadata");
                            SharedPreferences a6 = dxvw.a(this.a, "gms_icing_mdd_shared_files", this.c);
                            SharedPreferences.Editor edit2 = a6.edit();
                            for (String str2 : a6.getAll().keySet()) {
                                boolean z3 = z2;
                                try {
                                    dwtt a7 = dxvv.a(str2, this.a, this.b);
                                    dwtx dwtxVar2 = (dwtx) dxvw.c(a6, str2, dwtx.a.getParserForType());
                                    if (dwtxVar2 == null) {
                                        dxth.g("%s: Unable to read sharedFile from shared preferences.", "SharedFilesMetadata");
                                        edit2.remove(str2);
                                    } else {
                                        dxvw.f(edit2, str2);
                                        dxvw.g(edit2, dxvv.d(a7), dwtxVar2);
                                    }
                                } catch (dxvu unused2) {
                                    dxth.h("%s Failed to deserialize file key %s, remove and continue.", "SharedFilesMetadata", str2);
                                    this.b.a();
                                    edit2.remove(str2);
                                }
                                z2 = z3;
                            }
                            z = z2;
                            if (!edit2.commit()) {
                                dxth.f("Failed to commit migration metadata to disk");
                                dwxf dwxfVar4 = this.b;
                                new Exception("Migrate to ChecksumOnly failed.");
                                dwxfVar4.a();
                                if (dxkk.a(this.a, this.b).d != a.d && !dxkk.d(this.a, a)) {
                                    dxth.f(a.F(a, "Failed to commit migration version to disk. Fail to set target version to ", "."));
                                    dwxf dwxfVar32 = this.b;
                                    new Exception(a.F(a, "Fail to set target version ", "."));
                                    dwxfVar32.a();
                                }
                                z2 = z;
                            }
                            dxkk.d(this.a, dxkj.a(i5));
                            i5++;
                            z2 = z;
                            i3 = 1;
                            i4 = 2;
                        }
                    } finally {
                        if (dxkk.a(this.a, this.b).d != a.d && !dxkk.d(this.a, a)) {
                            dxth.f(a.F(a, "Failed to commit migration version to disk. Fail to set target version to ", "."));
                            dwxf dwxfVar5 = this.b;
                            new Exception(a.F(a, "Fail to set target version ", "."));
                            dwxfVar5.a();
                        }
                    }
                }
                z2 = true;
            }
        }
        return erqt.i(Boolean.valueOf(z2));
    }

    @Override // defpackage.dxpq
    public final ListenableFuture e(final dwtt dwttVar) {
        return elfr.j(f(new enpx(dwttVar)), new emwl() { // from class: dxpv
            @Override // defpackage.emwl
            public final Object apply(Object obj) {
                return (dwtx) ((enhk) obj).get(dwtt.this);
            }
        }, erpp.a);
    }

    @Override // defpackage.dxpq
    public final ListenableFuture f(enip enipVar) {
        SharedPreferences a = dxvw.a(this.a, "gms_icing_mdd_shared_files", this.c);
        enhd enhdVar = new enhd();
        enqu listIterator = enipVar.listIterator();
        while (listIterator.hasNext()) {
            dwtt dwttVar = (dwtt) listIterator.next();
            dwtx dwtxVar = (dwtx) dxvw.c(a, dxvv.b(dwttVar, this.a, this.b), dwtx.a.getParserForType());
            if (dwtxVar != null) {
                enhdVar.k(dwttVar, dwtxVar);
            }
        }
        return erqt.i(enhdVar.b());
    }

    @Override // defpackage.dxpq
    public final ListenableFuture g(dwtt dwttVar) {
        Context context = this.a;
        emxc emxcVar = this.c;
        return erqt.i(Boolean.valueOf(dxvw.h(dxvw.a(context, "gms_icing_mdd_shared_files", emxcVar), dxvv.b(dwttVar, context, this.b))));
    }

    @Override // defpackage.dxpq
    public final ListenableFuture h(dwtt dwttVar, dwtx dwtxVar) {
        Context context = this.a;
        emxc emxcVar = this.c;
        return erqt.i(Boolean.valueOf(dxvw.i(dxvw.a(context, "gms_icing_mdd_shared_files", emxcVar), dxvv.b(dwttVar, context, this.b), dwtxVar)));
    }
}
