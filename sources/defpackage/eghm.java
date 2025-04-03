package defpackage;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: PG */
/* loaded from: classes5.dex */
public final class eghm implements erqj, erog {
    private static final String[] b = {"_id", "date_added"};
    private final ContentResolver c;
    private final errl d;
    private egdt f;
    public final llg a = new llg();
    private final AtomicInteger e = new AtomicInteger(0);

    public eghm(Context context, errl errlVar) {
        this.c = context.getContentResolver();
        this.d = errlVar;
    }

    @Override // defpackage.erog
    public final ListenableFuture a() {
        Cursor query;
        egdt egdtVar = new egdt(fapt.OBAKE_DEVICE_PHOTO_FETCH, new emyg(emtt.a));
        egdtVar.d();
        this.f = egdtVar;
        int i = engw.d;
        engr engrVar = new engr();
        int i2 = kqq.a;
        if (Build.VERSION.SDK_INT >= 30) {
            Bundle bundle = new Bundle();
            bundle.putInt("android:query-arg-sort-direction", 1);
            bundle.putStringArray("android:query-arg-sort-columns", new String[]{"date_added"});
            query = this.c.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, b, bundle, null);
        } else {
            query = this.c.query(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, b, null, null, "date_added DESC");
        }
        if (query != null) {
            int columnIndex = query.getColumnIndex("_id");
            int columnIndex2 = query.getColumnIndex("date_added");
            while (query.moveToNext()) {
                long j = query.getLong(columnIndex);
                long j2 = query.getLong(columnIndex2);
                if (j2 > 0) {
                    engrVar.h(new eghi(j, emxc.j(eykm.f(j2))));
                } else {
                    engrVar.h(new eghi(j, emux.a));
                }
            }
            query.close();
        }
        this.e.set(2);
        return erqt.i(engrVar.g());
    }

    @Override // defpackage.erqj
    public final /* bridge */ /* synthetic */ void b(Object obj) {
        engw engwVar = (engw) obj;
        this.a.j(new eghj(engwVar, this.f.b(engwVar.size()), emux.a));
    }

    public final synchronized void c() {
        if (this.e.get() != 1 && this.e.get() != 2) {
            this.e.set(1);
            erqt.r(erqt.n(this, this.d), this, this.d);
        }
    }

    @Override // defpackage.erqj
    public final void hx(Throwable th) {
        egdt egdtVar = this.f;
        exfv exfvVar = (exfv) exfw.a.createBuilder();
        exgj exgjVar = (exgj) exgk.a.createBuilder();
        fapt faptVar = egdtVar.a;
        exgjVar.copyOnWrite();
        exgk exgkVar = (exgk) exgjVar.instance;
        exgkVar.c = faptVar.R;
        exgkVar.b |= 1;
        exfvVar.copyOnWrite();
        exfw exfwVar = (exfw) exfvVar.instance;
        exgk exgkVar2 = (exgk) exgjVar.build();
        exgkVar2.getClass();
        exfwVar.d = exgkVar2;
        exfwVar.c = 2;
        emyg emygVar = egdtVar.b;
        emygVar.g();
        long a = emygVar.a(TimeUnit.MICROSECONDS);
        exfvVar.copyOnWrite();
        exfw exfwVar2 = (exfw) exfvVar.instance;
        exfwVar2.b |= 1;
        exfwVar2.e = a;
        exft exftVar = (exft) exfu.a.createBuilder();
        exftVar.copyOnWrite();
        exfu exfuVar = (exfu) exftVar.instance;
        exfuVar.c = 2;
        exfuVar.b |= 1;
        exfvVar.copyOnWrite();
        exfw exfwVar3 = (exfw) exfvVar.instance;
        exfu exfuVar2 = (exfu) exftVar.build();
        exfuVar2.getClass();
        exfwVar3.f = exfuVar2;
        exfwVar3.b |= 2;
        exfw exfwVar4 = (exfw) exfvVar.build();
        egdp egdpVar = egdp.RETRYABLE;
        int i = engw.d;
        this.a.j(new eghj(enou.a, exfwVar4, emxc.j(egdpVar)));
    }
}
