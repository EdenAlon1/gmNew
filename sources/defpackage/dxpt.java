package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import com.google.common.util.concurrent.ListenableFuture;
import j$.nio.channels.DesugarChannels;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;

/* compiled from: PG */
/* loaded from: classes4.dex */
public final class dxpt implements dxih {
    public final Executor a;
    private final Context b;
    private final dwxf c;
    private final emxc d;
    private final dxbv e;

    public dxpt(Context context, dxbv dxbvVar, dwxf dwxfVar, emxc emxcVar, Executor executor) {
        this.b = context;
        this.e = dxbvVar;
        this.c = dwxfVar;
        this.d = emxcVar;
        this.a = executor;
    }

    @Override // defpackage.dxih
    public final ListenableFuture a(dwso dwsoVar) {
        dxth.c("%s: Adding file group %s", "SharedPreferencesFileGroupsMetadata", dwsoVar.d);
        dwso d = dxvk.d(dwsoVar, (this.e.a() / 1000) + dwsoVar.l);
        ArrayList arrayList = new ArrayList();
        arrayList.add(d);
        return m(arrayList);
    }

    @Override // defpackage.dxih
    public final ListenableFuture b() {
        dxvw.a(this.b, "gms_icing_mdd_groups", this.d).edit().clear().commit();
        dxvw.a(this.b, "gms_icing_mdd_group_key_properties", this.d).edit().clear().commit();
        return k();
    }

    @Override // defpackage.dxih
    public final ListenableFuture c() {
        return elfr.k(d(), new eroh() { // from class: dxps
            @Override // defpackage.eroh
            public final ListenableFuture a(Object obj) {
                final List list = (List) obj;
                final ArrayList arrayList = new ArrayList();
                Iterator it = list.iterator();
                while (true) {
                    dxpt dxptVar = dxpt.this;
                    if (!it.hasNext()) {
                        return dycg.a(arrayList).b(new erog() { // from class: dxpr
                            @Override // defpackage.erog
                            public final ListenableFuture a() {
                                ArrayList arrayList2 = new ArrayList();
                                int i = 0;
                                while (true) {
                                    List list2 = list;
                                    if (i >= list2.size()) {
                                        return erqt.i(arrayList2);
                                    }
                                    List list3 = arrayList;
                                    dwtm dwtmVar = (dwtm) list2.get(i);
                                    dwso dwsoVar = (dwso) erqt.q((Future) list3.get(i));
                                    if (dwsoVar != null) {
                                        arrayList2.add(new dxpz(dwtmVar, dwsoVar));
                                    }
                                    i++;
                                }
                            }
                        }, dxptVar.a);
                    }
                    arrayList.add(dxptVar.g((dwtm) it.next()));
                }
            }
        }, this.a);
    }

    @Override // defpackage.dxih
    public final ListenableFuture d() {
        ArrayList arrayList = new ArrayList();
        SharedPreferences a = dxvw.a(this.b, "gms_icing_mdd_groups", this.d);
        SharedPreferences.Editor editor = null;
        for (String str : a.getAll().keySet()) {
            try {
                arrayList.add(dxvm.a(str));
            } catch (dxvl e) {
                dxth.j(e, "Failed to deserialize groupKey:".concat(String.valueOf(str)));
                this.c.a();
                if (editor == null) {
                    editor = a.edit();
                }
                editor.remove(str);
                dxth.b("%s: Deleting null file group ", "SharedPreferencesFileGroupsMetadata");
            }
        }
        if (editor != null) {
            editor.commit();
        }
        return erqt.i(arrayList);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0048  */
    @Override // defpackage.dxih
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.google.common.util.concurrent.ListenableFuture e() {
        /*
            r7 = this;
            java.lang.String r0 = "FileGroupsMetadataUtil"
            android.content.Context r1 = r7.b
            emxc r2 = r7.d
            java.io.File r1 = defpackage.dxvm.b(r1, r2)
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L5c
            r2.<init>(r1)     // Catch: java.io.FileNotFoundException -> L5c
            r3 = 0
            r4 = 1
            long r5 = r1.length()     // Catch: java.lang.IllegalArgumentException -> L4d
            int r1 = (int) r5     // Catch: java.lang.IllegalArgumentException -> L4d
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.allocate(r1)     // Catch: java.lang.IllegalArgumentException -> L4d
            java.nio.channels.FileChannel r5 = r2.getChannel()     // Catch: java.io.IOException -> L3a
            java.nio.channels.FileChannel r5 = j$.nio.channels.DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(r5)     // Catch: java.io.IOException -> L3a
            r5.read(r1)     // Catch: java.io.IOException -> L3a
            r1.rewind()     // Catch: java.io.IOException -> L3a
            java.lang.Class<dwso> r5 = defpackage.dwso.class
            dwso r6 = defpackage.dwso.a     // Catch: java.io.IOException -> L3a
            eyhz r6 = r6.getParserForType()     // Catch: java.io.IOException -> L3a
            java.util.List r1 = defpackage.dxvt.b(r1, r5, r6)     // Catch: java.io.IOException -> L3a
            r2.close()     // Catch: java.io.IOException -> L38
            goto L46
        L38:
            r2 = move-exception
            goto L3d
        L3a:
            r1 = move-exception
            r2 = r1
            r1 = 0
        L3d:
            java.lang.Object[] r4 = new java.lang.Object[r4]
            r4[r3] = r0
            java.lang.String r0 = "%s: IOException occurred while reading file groups."
            defpackage.dxth.k(r2, r0, r4)
        L46:
            if (r1 != 0) goto L69
            int r0 = defpackage.engw.d
            engw r1 = defpackage.enou.a
            goto L69
        L4d:
            r1 = move-exception
            java.lang.Object[] r2 = new java.lang.Object[r4]
            r2[r3] = r0
            java.lang.String r0 = "%s: Exception while reading from stale groups into buffer."
            defpackage.dxth.k(r1, r0, r2)
            int r0 = defpackage.engw.d
            engw r1 = defpackage.enou.a
            goto L69
        L5c:
            java.lang.String r0 = r1.getAbsolutePath()
            java.lang.String r1 = "File %s not found while reading."
            defpackage.dxth.b(r1, r0)
            int r0 = defpackage.engw.d
            engw r1 = defpackage.enou.a
        L69:
            com.google.common.util.concurrent.ListenableFuture r0 = defpackage.erqt.i(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dxpt.e():com.google.common.util.concurrent.ListenableFuture");
    }

    @Override // defpackage.dxih
    public final ListenableFuture f() {
        return erre.a;
    }

    @Override // defpackage.dxih
    public final ListenableFuture g(dwtm dwtmVar) {
        Context context = this.b;
        return erqt.i((dwso) dxvw.c(dxvw.a(context, "gms_icing_mdd_groups", this.d), dxvm.c(dwtmVar), dwso.a.getParserForType()));
    }

    @Override // defpackage.dxih
    public final ListenableFuture h(dwtm dwtmVar) {
        Context context = this.b;
        return erqt.i((dwto) dxvw.c(dxvw.a(context, "gms_icing_mdd_group_key_properties", this.d), dxvm.c(dwtmVar), dwto.a.getParserForType()));
    }

    @Override // defpackage.dxih
    public final ListenableFuture i(dwtm dwtmVar) {
        Context context = this.b;
        emxc emxcVar = this.d;
        return erqt.i(Boolean.valueOf(dxvw.h(dxvw.a(context, "gms_icing_mdd_groups", emxcVar), dxvm.c(dwtmVar))));
    }

    @Override // defpackage.dxih
    public final ListenableFuture j(List list) {
        SharedPreferences.Editor edit = dxvw.a(this.b, "gms_icing_mdd_groups", this.d).edit();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            dwtm dwtmVar = (dwtm) it.next();
            dxth.d("%s: Removing group %s %s", "SharedPreferencesFileGroupsMetadata", dwtmVar.c, dwtmVar.d);
            edit.remove(dxvw.e(dwtmVar));
        }
        return erqt.i(Boolean.valueOf(edit.commit()));
    }

    @Override // defpackage.dxih
    public final ListenableFuture k() {
        n().delete();
        return erre.a;
    }

    @Override // defpackage.dxih
    public final ListenableFuture l(dwtm dwtmVar, dwso dwsoVar) {
        Context context = this.b;
        emxc emxcVar = this.d;
        return erqt.i(Boolean.valueOf(dxvw.i(dxvw.a(context, "gms_icing_mdd_groups", emxcVar), dxvm.c(dwtmVar), dwsoVar)));
    }

    @Override // defpackage.dxih
    public final ListenableFuture m(List list) {
        File n = n();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(n, true);
            try {
                ByteBuffer a = dxvt.a(list);
                if (a != null) {
                    DesugarChannels.convertMaybeLegacyFileChannelFromLibrary(fileOutputStream.getChannel()).write(a);
                }
                fileOutputStream.close();
                return erqt.i(true);
            } catch (IOException unused) {
                dxth.f("IOException occurred while writing file groups.");
                return erqt.i(false);
            }
        } catch (FileNotFoundException unused2) {
            dxth.g("File %s not found while writing.", n.getAbsolutePath());
            return erqt.i(false);
        }
    }

    final File n() {
        return dxvm.b(this.b, this.d);
    }
}
