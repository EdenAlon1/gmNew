package defpackage;

import android.content.ContentValues;
import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.google.android.apps.messaging.shared.datamodel.data.message.part.MessagePartCoreData;
import com.google.android.ims.rcsservice.businessinfo.BusinessInfoDatabaseConstants;
import j$.util.Optional;
import java.util.HashMap;
import java.util.Random;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes3.dex */
public final class davk {
    public static final long a = TimeUnit.SECONDS.toMillis(10);
    public final byzp b;
    public final bcwz c;
    public final cgte d;
    public final fazb e;
    public final cqoh f;
    public final covs g;
    public final Context h;
    public final ffbr i;
    public final ffbr j;
    public final ddzb k;
    public final Optional l;
    public final asmj m;
    public final ffbr n;

    public davk(byzp byzpVar, bcwz bcwzVar, cgte cgteVar, fazb fazbVar, cqoh cqohVar, covs covsVar, Context context, ffbr ffbrVar, ffbr ffbrVar2, ddzb ddzbVar, Optional optional, asmj asmjVar, ffbr ffbrVar3) {
        this.b = byzpVar;
        this.c = bcwzVar;
        this.d = cgteVar;
        this.e = fazbVar;
        this.f = cqohVar;
        this.g = covsVar;
        this.h = context;
        this.i = ffbrVar;
        this.j = ffbrVar2;
        this.k = ddzbVar;
        this.l = optional;
        this.m = asmjVar;
        this.n = ffbrVar3;
    }

    public static ContentValues a(String str, String str2, long j, long j2, long j3, boolean z, boolean z2, boolean z3) {
        ContentValues contentValues = new ContentValues(9);
        contentValues.put("address", str);
        contentValues.put("body", str2);
        Long valueOf = Long.valueOf(j);
        contentValues.put("date_sent", valueOf);
        contentValues.put("date", valueOf);
        contentValues.put("read", Boolean.valueOf(z3));
        contentValues.put("seen", Boolean.valueOf(z2));
        contentValues.put("protocol", (Integer) 0);
        contentValues.put(BusinessInfoDatabaseConstants.BusinessInfoPropertiesTableConstants.Columns.TYPE, Integer.valueOf(true == z ? 2 : 1));
        if (j3 != -1) {
            contentValues.put("person", Long.valueOf(j3));
        }
        contentValues.put("sub_id", (Integer) (-1));
        contentValues.put("thread_id", Long.valueOf(j2));
        return contentValues;
    }

    public static Uri b(Context context, int i) {
        Resources resources = context.getResources();
        return new Uri.Builder().scheme("android.resource").authority(resources.getResourcePackageName(i)).appendPath(resources.getResourceTypeName(i)).appendPath(resources.getResourceEntryName(i)).build();
    }

    public final MessagePartCoreData c(Uri uri, String str, String str2) {
        bcxb C = bcxc.C();
        bcqk bcqkVar = (bcqk) C;
        bcqkVar.b = str;
        bcqkVar.c = str2;
        bcqkVar.d = uri;
        bcqkVar.e = uri;
        C.o(eohh.NOT_AVAILABLE);
        return this.c.c(C.r());
    }

    public final cslh d(Context context, int i, String str, int i2, TextView textView, ProgressBar progressBar, String str2, long j, int i3, long j2, covs covsVar, Context context2) {
        int i4 = i * i2;
        davi daviVar = new davi(this, progressBar, i4, textView, i, str, covsVar, new HashMap(), i2, new Random(), j - (a * i4), str2, new String[]{"alpha", "bravo", "charlie", "delta", "echo", "foxtrot", "golf", "hotel", "indigo", "juliet", "kilo", "lima", "mike", "november", "oscar", "papa", "quebec", "romeo", "sierra", "tango", "uniform", "victor", "whiskey", "x-ray", "yankee", "zulu"}, j2, context, context2, i3);
        daviVar.e(new Void[0]);
        return daviVar;
    }
}
