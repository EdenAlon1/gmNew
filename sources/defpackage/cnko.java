package defpackage;

import android.content.Context;
import com.google.android.ims.filetransfer.http.message.FileInfo;
import com.google.android.rcs.client.messaging.data.ContentType;
import j$.time.Instant;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes8.dex */
public final class cnko {
    public static final cskc a = cskc.g("BugleAction", "IncomingRcsFileTransferEventProcessor");
    public static final cfup b = cfvl.f(cfvl.b, "default_expiry_ft_metadata_update", TimeUnit.DAYS.toMillis(1));
    public final Context c;
    public final errl d;
    public final ffbr e;
    public final cqoh f;
    public final crai g;
    public final cqxl h;
    public final crbq i;

    public cnko(Context context, errl errlVar, crbq crbqVar, ffbr ffbrVar, cqoh cqohVar, crai craiVar, cqxl cqxlVar) {
        this.c = context;
        this.d = errlVar;
        this.i = crbqVar;
        this.e = ffbrVar;
        this.f = cqohVar;
        this.g = craiVar;
        this.h = cqxlVar;
    }

    public static awvb a(Instant instant, FileInfo fileInfo) {
        avty avtyVar = new avty();
        awva awvaVar = (awva) awvb.a.createBuilder();
        awup awupVar = (awup) avtyVar.m().fP(ContentType.e(fileInfo.mContentType));
        awvaVar.copyOnWrite();
        awvb awvbVar = (awvb) awvaVar.instance;
        awupVar.getClass();
        awvbVar.e = awupVar;
        awvbVar.b |= 1;
        awvaVar.copyOnWrite();
        awvb awvbVar2 = (awvb) awvaVar.instance;
        String str = fileInfo.mUrl;
        str.getClass();
        awvbVar2.f = str;
        eyja b2 = eykj.b(instant);
        awvaVar.copyOnWrite();
        awvb awvbVar3 = (awvb) awvaVar.instance;
        b2.getClass();
        awvbVar3.g = b2;
        awvbVar3.b |= 2;
        int i = (int) fileInfo.mSize;
        awvaVar.copyOnWrite();
        ((awvb) awvaVar.instance).d = i;
        String str2 = fileInfo.mFileName;
        if (str2 == null) {
            return (awvb) awvaVar.build();
        }
        awvaVar.copyOnWrite();
        ((awvb) awvaVar.instance).c = str2;
        return (awvb) awvaVar.build();
    }
}
