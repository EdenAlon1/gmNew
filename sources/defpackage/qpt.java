package defpackage;

import android.R;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.util.Log;
import android.view.View;
import com.bumptech.glide.GeneratedAppGlideModule;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class qpt implements ComponentCallbacks2 {
    private static volatile qpt h;
    private static volatile boolean i;
    public final qxf a;
    public final qyg b;
    public final qpz c;
    public final qxd d;
    public final List e = new ArrayList();
    public qqd f = qqd.NORMAL;
    public final rgm g;
    private final qwe j;
    private final rhb k;

    public qpt(Context context, qwe qweVar, qyg qygVar, qxf qxfVar, qxd qxdVar, rhb rhbVar, rgm rgmVar, qps qpsVar, Map map, List list, List list2, rhl rhlVar, qqb qqbVar) {
        this.j = qweVar;
        this.a = qxfVar;
        this.d = qxdVar;
        this.b = qygVar;
        this.k = rhbVar;
        this.g = rgmVar;
        this.c = new qpz(context, qxdVar, new qql(this, list2, rhlVar), new ris(), qpsVar, map, list, qweVar, qqbVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01f5 A[Catch: all -> 0x02bb, TryCatch #6 {all -> 0x02bb, blocks: (B:13:0x001d, B:15:0x0031, B:16:0x0038, B:18:0x003d, B:20:0x004e, B:23:0x0053, B:25:0x005b, B:26:0x0072, B:27:0x007c, B:29:0x0082, B:32:0x0096, B:35:0x00a5, B:41:0x00b1, B:43:0x00b9, B:45:0x00d2, B:47:0x00dc, B:48:0x00e4, B:50:0x00ea, B:53:0x00fa, B:55:0x0102, B:56:0x0115, B:61:0x0119, B:63:0x0121, B:64:0x0125, B:66:0x012b, B:69:0x014b, B:70:0x0151, B:71:0x0157, B:73:0x015d, B:76:0x0166, B:77:0x0169, B:79:0x016d, B:80:0x0185, B:82:0x0189, B:83:0x019d, B:85:0x01a1, B:88:0x01aa, B:90:0x01bc, B:92:0x01c0, B:93:0x01cc, B:95:0x01d0, B:96:0x01d7, B:98:0x01db, B:100:0x01e1, B:101:0x01ea, B:102:0x01f1, B:104:0x01f5, B:105:0x0200, B:107:0x0204, B:108:0x0210, B:110:0x0214, B:111:0x021b, B:113:0x021f, B:114:0x0251, B:116:0x0255, B:117:0x0260, B:161:0x025a, B:163:0x00c1, B:165:0x00c9), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0204 A[Catch: all -> 0x02bb, TryCatch #6 {all -> 0x02bb, blocks: (B:13:0x001d, B:15:0x0031, B:16:0x0038, B:18:0x003d, B:20:0x004e, B:23:0x0053, B:25:0x005b, B:26:0x0072, B:27:0x007c, B:29:0x0082, B:32:0x0096, B:35:0x00a5, B:41:0x00b1, B:43:0x00b9, B:45:0x00d2, B:47:0x00dc, B:48:0x00e4, B:50:0x00ea, B:53:0x00fa, B:55:0x0102, B:56:0x0115, B:61:0x0119, B:63:0x0121, B:64:0x0125, B:66:0x012b, B:69:0x014b, B:70:0x0151, B:71:0x0157, B:73:0x015d, B:76:0x0166, B:77:0x0169, B:79:0x016d, B:80:0x0185, B:82:0x0189, B:83:0x019d, B:85:0x01a1, B:88:0x01aa, B:90:0x01bc, B:92:0x01c0, B:93:0x01cc, B:95:0x01d0, B:96:0x01d7, B:98:0x01db, B:100:0x01e1, B:101:0x01ea, B:102:0x01f1, B:104:0x01f5, B:105:0x0200, B:107:0x0204, B:108:0x0210, B:110:0x0214, B:111:0x021b, B:113:0x021f, B:114:0x0251, B:116:0x0255, B:117:0x0260, B:161:0x025a, B:163:0x00c1, B:165:0x00c9), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0214 A[Catch: all -> 0x02bb, TryCatch #6 {all -> 0x02bb, blocks: (B:13:0x001d, B:15:0x0031, B:16:0x0038, B:18:0x003d, B:20:0x004e, B:23:0x0053, B:25:0x005b, B:26:0x0072, B:27:0x007c, B:29:0x0082, B:32:0x0096, B:35:0x00a5, B:41:0x00b1, B:43:0x00b9, B:45:0x00d2, B:47:0x00dc, B:48:0x00e4, B:50:0x00ea, B:53:0x00fa, B:55:0x0102, B:56:0x0115, B:61:0x0119, B:63:0x0121, B:64:0x0125, B:66:0x012b, B:69:0x014b, B:70:0x0151, B:71:0x0157, B:73:0x015d, B:76:0x0166, B:77:0x0169, B:79:0x016d, B:80:0x0185, B:82:0x0189, B:83:0x019d, B:85:0x01a1, B:88:0x01aa, B:90:0x01bc, B:92:0x01c0, B:93:0x01cc, B:95:0x01d0, B:96:0x01d7, B:98:0x01db, B:100:0x01e1, B:101:0x01ea, B:102:0x01f1, B:104:0x01f5, B:105:0x0200, B:107:0x0204, B:108:0x0210, B:110:0x0214, B:111:0x021b, B:113:0x021f, B:114:0x0251, B:116:0x0255, B:117:0x0260, B:161:0x025a, B:163:0x00c1, B:165:0x00c9), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x021f A[Catch: all -> 0x02bb, TryCatch #6 {all -> 0x02bb, blocks: (B:13:0x001d, B:15:0x0031, B:16:0x0038, B:18:0x003d, B:20:0x004e, B:23:0x0053, B:25:0x005b, B:26:0x0072, B:27:0x007c, B:29:0x0082, B:32:0x0096, B:35:0x00a5, B:41:0x00b1, B:43:0x00b9, B:45:0x00d2, B:47:0x00dc, B:48:0x00e4, B:50:0x00ea, B:53:0x00fa, B:55:0x0102, B:56:0x0115, B:61:0x0119, B:63:0x0121, B:64:0x0125, B:66:0x012b, B:69:0x014b, B:70:0x0151, B:71:0x0157, B:73:0x015d, B:76:0x0166, B:77:0x0169, B:79:0x016d, B:80:0x0185, B:82:0x0189, B:83:0x019d, B:85:0x01a1, B:88:0x01aa, B:90:0x01bc, B:92:0x01c0, B:93:0x01cc, B:95:0x01d0, B:96:0x01d7, B:98:0x01db, B:100:0x01e1, B:101:0x01ea, B:102:0x01f1, B:104:0x01f5, B:105:0x0200, B:107:0x0204, B:108:0x0210, B:110:0x0214, B:111:0x021b, B:113:0x021f, B:114:0x0251, B:116:0x0255, B:117:0x0260, B:161:0x025a, B:163:0x00c1, B:165:0x00c9), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0255 A[Catch: all -> 0x02bb, TryCatch #6 {all -> 0x02bb, blocks: (B:13:0x001d, B:15:0x0031, B:16:0x0038, B:18:0x003d, B:20:0x004e, B:23:0x0053, B:25:0x005b, B:26:0x0072, B:27:0x007c, B:29:0x0082, B:32:0x0096, B:35:0x00a5, B:41:0x00b1, B:43:0x00b9, B:45:0x00d2, B:47:0x00dc, B:48:0x00e4, B:50:0x00ea, B:53:0x00fa, B:55:0x0102, B:56:0x0115, B:61:0x0119, B:63:0x0121, B:64:0x0125, B:66:0x012b, B:69:0x014b, B:70:0x0151, B:71:0x0157, B:73:0x015d, B:76:0x0166, B:77:0x0169, B:79:0x016d, B:80:0x0185, B:82:0x0189, B:83:0x019d, B:85:0x01a1, B:88:0x01aa, B:90:0x01bc, B:92:0x01c0, B:93:0x01cc, B:95:0x01d0, B:96:0x01d7, B:98:0x01db, B:100:0x01e1, B:101:0x01ea, B:102:0x01f1, B:104:0x01f5, B:105:0x0200, B:107:0x0204, B:108:0x0210, B:110:0x0214, B:111:0x021b, B:113:0x021f, B:114:0x0251, B:116:0x0255, B:117:0x0260, B:161:0x025a, B:163:0x00c1, B:165:0x00c9), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:161:0x025a A[Catch: all -> 0x02bb, TryCatch #6 {all -> 0x02bb, blocks: (B:13:0x001d, B:15:0x0031, B:16:0x0038, B:18:0x003d, B:20:0x004e, B:23:0x0053, B:25:0x005b, B:26:0x0072, B:27:0x007c, B:29:0x0082, B:32:0x0096, B:35:0x00a5, B:41:0x00b1, B:43:0x00b9, B:45:0x00d2, B:47:0x00dc, B:48:0x00e4, B:50:0x00ea, B:53:0x00fa, B:55:0x0102, B:56:0x0115, B:61:0x0119, B:63:0x0121, B:64:0x0125, B:66:0x012b, B:69:0x014b, B:70:0x0151, B:71:0x0157, B:73:0x015d, B:76:0x0166, B:77:0x0169, B:79:0x016d, B:80:0x0185, B:82:0x0189, B:83:0x019d, B:85:0x01a1, B:88:0x01aa, B:90:0x01bc, B:92:0x01c0, B:93:0x01cc, B:95:0x01d0, B:96:0x01d7, B:98:0x01db, B:100:0x01e1, B:101:0x01ea, B:102:0x01f1, B:104:0x01f5, B:105:0x0200, B:107:0x0204, B:108:0x0210, B:110:0x0214, B:111:0x021b, B:113:0x021f, B:114:0x0251, B:116:0x0255, B:117:0x0260, B:161:0x025a, B:163:0x00c1, B:165:0x00c9), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ea A[Catch: all -> 0x02bb, TryCatch #6 {all -> 0x02bb, blocks: (B:13:0x001d, B:15:0x0031, B:16:0x0038, B:18:0x003d, B:20:0x004e, B:23:0x0053, B:25:0x005b, B:26:0x0072, B:27:0x007c, B:29:0x0082, B:32:0x0096, B:35:0x00a5, B:41:0x00b1, B:43:0x00b9, B:45:0x00d2, B:47:0x00dc, B:48:0x00e4, B:50:0x00ea, B:53:0x00fa, B:55:0x0102, B:56:0x0115, B:61:0x0119, B:63:0x0121, B:64:0x0125, B:66:0x012b, B:69:0x014b, B:70:0x0151, B:71:0x0157, B:73:0x015d, B:76:0x0166, B:77:0x0169, B:79:0x016d, B:80:0x0185, B:82:0x0189, B:83:0x019d, B:85:0x01a1, B:88:0x01aa, B:90:0x01bc, B:92:0x01c0, B:93:0x01cc, B:95:0x01d0, B:96:0x01d7, B:98:0x01db, B:100:0x01e1, B:101:0x01ea, B:102:0x01f1, B:104:0x01f5, B:105:0x0200, B:107:0x0204, B:108:0x0210, B:110:0x0214, B:111:0x021b, B:113:0x021f, B:114:0x0251, B:116:0x0255, B:117:0x0260, B:161:0x025a, B:163:0x00c1, B:165:0x00c9), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0121 A[Catch: all -> 0x02bb, TryCatch #6 {all -> 0x02bb, blocks: (B:13:0x001d, B:15:0x0031, B:16:0x0038, B:18:0x003d, B:20:0x004e, B:23:0x0053, B:25:0x005b, B:26:0x0072, B:27:0x007c, B:29:0x0082, B:32:0x0096, B:35:0x00a5, B:41:0x00b1, B:43:0x00b9, B:45:0x00d2, B:47:0x00dc, B:48:0x00e4, B:50:0x00ea, B:53:0x00fa, B:55:0x0102, B:56:0x0115, B:61:0x0119, B:63:0x0121, B:64:0x0125, B:66:0x012b, B:69:0x014b, B:70:0x0151, B:71:0x0157, B:73:0x015d, B:76:0x0166, B:77:0x0169, B:79:0x016d, B:80:0x0185, B:82:0x0189, B:83:0x019d, B:85:0x01a1, B:88:0x01aa, B:90:0x01bc, B:92:0x01c0, B:93:0x01cc, B:95:0x01d0, B:96:0x01d7, B:98:0x01db, B:100:0x01e1, B:101:0x01ea, B:102:0x01f1, B:104:0x01f5, B:105:0x0200, B:107:0x0204, B:108:0x0210, B:110:0x0214, B:111:0x021b, B:113:0x021f, B:114:0x0251, B:116:0x0255, B:117:0x0260, B:161:0x025a, B:163:0x00c1, B:165:0x00c9), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x014b A[Catch: all -> 0x02bb, TryCatch #6 {all -> 0x02bb, blocks: (B:13:0x001d, B:15:0x0031, B:16:0x0038, B:18:0x003d, B:20:0x004e, B:23:0x0053, B:25:0x005b, B:26:0x0072, B:27:0x007c, B:29:0x0082, B:32:0x0096, B:35:0x00a5, B:41:0x00b1, B:43:0x00b9, B:45:0x00d2, B:47:0x00dc, B:48:0x00e4, B:50:0x00ea, B:53:0x00fa, B:55:0x0102, B:56:0x0115, B:61:0x0119, B:63:0x0121, B:64:0x0125, B:66:0x012b, B:69:0x014b, B:70:0x0151, B:71:0x0157, B:73:0x015d, B:76:0x0166, B:77:0x0169, B:79:0x016d, B:80:0x0185, B:82:0x0189, B:83:0x019d, B:85:0x01a1, B:88:0x01aa, B:90:0x01bc, B:92:0x01c0, B:93:0x01cc, B:95:0x01d0, B:96:0x01d7, B:98:0x01db, B:100:0x01e1, B:101:0x01ea, B:102:0x01f1, B:104:0x01f5, B:105:0x0200, B:107:0x0204, B:108:0x0210, B:110:0x0214, B:111:0x021b, B:113:0x021f, B:114:0x0251, B:116:0x0255, B:117:0x0260, B:161:0x025a, B:163:0x00c1, B:165:0x00c9), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:73:0x015d A[Catch: all -> 0x02bb, LOOP:3: B:71:0x0157->B:73:0x015d, LOOP_END, TryCatch #6 {all -> 0x02bb, blocks: (B:13:0x001d, B:15:0x0031, B:16:0x0038, B:18:0x003d, B:20:0x004e, B:23:0x0053, B:25:0x005b, B:26:0x0072, B:27:0x007c, B:29:0x0082, B:32:0x0096, B:35:0x00a5, B:41:0x00b1, B:43:0x00b9, B:45:0x00d2, B:47:0x00dc, B:48:0x00e4, B:50:0x00ea, B:53:0x00fa, B:55:0x0102, B:56:0x0115, B:61:0x0119, B:63:0x0121, B:64:0x0125, B:66:0x012b, B:69:0x014b, B:70:0x0151, B:71:0x0157, B:73:0x015d, B:76:0x0166, B:77:0x0169, B:79:0x016d, B:80:0x0185, B:82:0x0189, B:83:0x019d, B:85:0x01a1, B:88:0x01aa, B:90:0x01bc, B:92:0x01c0, B:93:0x01cc, B:95:0x01d0, B:96:0x01d7, B:98:0x01db, B:100:0x01e1, B:101:0x01ea, B:102:0x01f1, B:104:0x01f5, B:105:0x0200, B:107:0x0204, B:108:0x0210, B:110:0x0214, B:111:0x021b, B:113:0x021f, B:114:0x0251, B:116:0x0255, B:117:0x0260, B:161:0x025a, B:163:0x00c1, B:165:0x00c9), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0166 A[Catch: all -> 0x02bb, TryCatch #6 {all -> 0x02bb, blocks: (B:13:0x001d, B:15:0x0031, B:16:0x0038, B:18:0x003d, B:20:0x004e, B:23:0x0053, B:25:0x005b, B:26:0x0072, B:27:0x007c, B:29:0x0082, B:32:0x0096, B:35:0x00a5, B:41:0x00b1, B:43:0x00b9, B:45:0x00d2, B:47:0x00dc, B:48:0x00e4, B:50:0x00ea, B:53:0x00fa, B:55:0x0102, B:56:0x0115, B:61:0x0119, B:63:0x0121, B:64:0x0125, B:66:0x012b, B:69:0x014b, B:70:0x0151, B:71:0x0157, B:73:0x015d, B:76:0x0166, B:77:0x0169, B:79:0x016d, B:80:0x0185, B:82:0x0189, B:83:0x019d, B:85:0x01a1, B:88:0x01aa, B:90:0x01bc, B:92:0x01c0, B:93:0x01cc, B:95:0x01d0, B:96:0x01d7, B:98:0x01db, B:100:0x01e1, B:101:0x01ea, B:102:0x01f1, B:104:0x01f5, B:105:0x0200, B:107:0x0204, B:108:0x0210, B:110:0x0214, B:111:0x021b, B:113:0x021f, B:114:0x0251, B:116:0x0255, B:117:0x0260, B:161:0x025a, B:163:0x00c1, B:165:0x00c9), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:79:0x016d A[Catch: all -> 0x02bb, TryCatch #6 {all -> 0x02bb, blocks: (B:13:0x001d, B:15:0x0031, B:16:0x0038, B:18:0x003d, B:20:0x004e, B:23:0x0053, B:25:0x005b, B:26:0x0072, B:27:0x007c, B:29:0x0082, B:32:0x0096, B:35:0x00a5, B:41:0x00b1, B:43:0x00b9, B:45:0x00d2, B:47:0x00dc, B:48:0x00e4, B:50:0x00ea, B:53:0x00fa, B:55:0x0102, B:56:0x0115, B:61:0x0119, B:63:0x0121, B:64:0x0125, B:66:0x012b, B:69:0x014b, B:70:0x0151, B:71:0x0157, B:73:0x015d, B:76:0x0166, B:77:0x0169, B:79:0x016d, B:80:0x0185, B:82:0x0189, B:83:0x019d, B:85:0x01a1, B:88:0x01aa, B:90:0x01bc, B:92:0x01c0, B:93:0x01cc, B:95:0x01d0, B:96:0x01d7, B:98:0x01db, B:100:0x01e1, B:101:0x01ea, B:102:0x01f1, B:104:0x01f5, B:105:0x0200, B:107:0x0204, B:108:0x0210, B:110:0x0214, B:111:0x021b, B:113:0x021f, B:114:0x0251, B:116:0x0255, B:117:0x0260, B:161:0x025a, B:163:0x00c1, B:165:0x00c9), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0189 A[Catch: all -> 0x02bb, TryCatch #6 {all -> 0x02bb, blocks: (B:13:0x001d, B:15:0x0031, B:16:0x0038, B:18:0x003d, B:20:0x004e, B:23:0x0053, B:25:0x005b, B:26:0x0072, B:27:0x007c, B:29:0x0082, B:32:0x0096, B:35:0x00a5, B:41:0x00b1, B:43:0x00b9, B:45:0x00d2, B:47:0x00dc, B:48:0x00e4, B:50:0x00ea, B:53:0x00fa, B:55:0x0102, B:56:0x0115, B:61:0x0119, B:63:0x0121, B:64:0x0125, B:66:0x012b, B:69:0x014b, B:70:0x0151, B:71:0x0157, B:73:0x015d, B:76:0x0166, B:77:0x0169, B:79:0x016d, B:80:0x0185, B:82:0x0189, B:83:0x019d, B:85:0x01a1, B:88:0x01aa, B:90:0x01bc, B:92:0x01c0, B:93:0x01cc, B:95:0x01d0, B:96:0x01d7, B:98:0x01db, B:100:0x01e1, B:101:0x01ea, B:102:0x01f1, B:104:0x01f5, B:105:0x0200, B:107:0x0204, B:108:0x0210, B:110:0x0214, B:111:0x021b, B:113:0x021f, B:114:0x0251, B:116:0x0255, B:117:0x0260, B:161:0x025a, B:163:0x00c1, B:165:0x00c9), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01a1 A[Catch: all -> 0x02bb, TryCatch #6 {all -> 0x02bb, blocks: (B:13:0x001d, B:15:0x0031, B:16:0x0038, B:18:0x003d, B:20:0x004e, B:23:0x0053, B:25:0x005b, B:26:0x0072, B:27:0x007c, B:29:0x0082, B:32:0x0096, B:35:0x00a5, B:41:0x00b1, B:43:0x00b9, B:45:0x00d2, B:47:0x00dc, B:48:0x00e4, B:50:0x00ea, B:53:0x00fa, B:55:0x0102, B:56:0x0115, B:61:0x0119, B:63:0x0121, B:64:0x0125, B:66:0x012b, B:69:0x014b, B:70:0x0151, B:71:0x0157, B:73:0x015d, B:76:0x0166, B:77:0x0169, B:79:0x016d, B:80:0x0185, B:82:0x0189, B:83:0x019d, B:85:0x01a1, B:88:0x01aa, B:90:0x01bc, B:92:0x01c0, B:93:0x01cc, B:95:0x01d0, B:96:0x01d7, B:98:0x01db, B:100:0x01e1, B:101:0x01ea, B:102:0x01f1, B:104:0x01f5, B:105:0x0200, B:107:0x0204, B:108:0x0210, B:110:0x0214, B:111:0x021b, B:113:0x021f, B:114:0x0251, B:116:0x0255, B:117:0x0260, B:161:0x025a, B:163:0x00c1, B:165:0x00c9), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01c0 A[Catch: all -> 0x02bb, TryCatch #6 {all -> 0x02bb, blocks: (B:13:0x001d, B:15:0x0031, B:16:0x0038, B:18:0x003d, B:20:0x004e, B:23:0x0053, B:25:0x005b, B:26:0x0072, B:27:0x007c, B:29:0x0082, B:32:0x0096, B:35:0x00a5, B:41:0x00b1, B:43:0x00b9, B:45:0x00d2, B:47:0x00dc, B:48:0x00e4, B:50:0x00ea, B:53:0x00fa, B:55:0x0102, B:56:0x0115, B:61:0x0119, B:63:0x0121, B:64:0x0125, B:66:0x012b, B:69:0x014b, B:70:0x0151, B:71:0x0157, B:73:0x015d, B:76:0x0166, B:77:0x0169, B:79:0x016d, B:80:0x0185, B:82:0x0189, B:83:0x019d, B:85:0x01a1, B:88:0x01aa, B:90:0x01bc, B:92:0x01c0, B:93:0x01cc, B:95:0x01d0, B:96:0x01d7, B:98:0x01db, B:100:0x01e1, B:101:0x01ea, B:102:0x01f1, B:104:0x01f5, B:105:0x0200, B:107:0x0204, B:108:0x0210, B:110:0x0214, B:111:0x021b, B:113:0x021f, B:114:0x0251, B:116:0x0255, B:117:0x0260, B:161:0x025a, B:163:0x00c1, B:165:0x00c9), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:95:0x01d0 A[Catch: all -> 0x02bb, TryCatch #6 {all -> 0x02bb, blocks: (B:13:0x001d, B:15:0x0031, B:16:0x0038, B:18:0x003d, B:20:0x004e, B:23:0x0053, B:25:0x005b, B:26:0x0072, B:27:0x007c, B:29:0x0082, B:32:0x0096, B:35:0x00a5, B:41:0x00b1, B:43:0x00b9, B:45:0x00d2, B:47:0x00dc, B:48:0x00e4, B:50:0x00ea, B:53:0x00fa, B:55:0x0102, B:56:0x0115, B:61:0x0119, B:63:0x0121, B:64:0x0125, B:66:0x012b, B:69:0x014b, B:70:0x0151, B:71:0x0157, B:73:0x015d, B:76:0x0166, B:77:0x0169, B:79:0x016d, B:80:0x0185, B:82:0x0189, B:83:0x019d, B:85:0x01a1, B:88:0x01aa, B:90:0x01bc, B:92:0x01c0, B:93:0x01cc, B:95:0x01d0, B:96:0x01d7, B:98:0x01db, B:100:0x01e1, B:101:0x01ea, B:102:0x01f1, B:104:0x01f5, B:105:0x0200, B:107:0x0204, B:108:0x0210, B:110:0x0214, B:111:0x021b, B:113:0x021f, B:114:0x0251, B:116:0x0255, B:117:0x0260, B:161:0x025a, B:163:0x00c1, B:165:0x00c9), top: B:12:0x001d }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01db A[Catch: all -> 0x02bb, TryCatch #6 {all -> 0x02bb, blocks: (B:13:0x001d, B:15:0x0031, B:16:0x0038, B:18:0x003d, B:20:0x004e, B:23:0x0053, B:25:0x005b, B:26:0x0072, B:27:0x007c, B:29:0x0082, B:32:0x0096, B:35:0x00a5, B:41:0x00b1, B:43:0x00b9, B:45:0x00d2, B:47:0x00dc, B:48:0x00e4, B:50:0x00ea, B:53:0x00fa, B:55:0x0102, B:56:0x0115, B:61:0x0119, B:63:0x0121, B:64:0x0125, B:66:0x012b, B:69:0x014b, B:70:0x0151, B:71:0x0157, B:73:0x015d, B:76:0x0166, B:77:0x0169, B:79:0x016d, B:80:0x0185, B:82:0x0189, B:83:0x019d, B:85:0x01a1, B:88:0x01aa, B:90:0x01bc, B:92:0x01c0, B:93:0x01cc, B:95:0x01d0, B:96:0x01d7, B:98:0x01db, B:100:0x01e1, B:101:0x01ea, B:102:0x01f1, B:104:0x01f5, B:105:0x0200, B:107:0x0204, B:108:0x0210, B:110:0x0214, B:111:0x021b, B:113:0x021f, B:114:0x0251, B:116:0x0255, B:117:0x0260, B:161:0x025a, B:163:0x00c1, B:165:0x00c9), top: B:12:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.qpt b(android.content.Context r23) {
        /*
            Method dump skipped, instructions count: 721
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qpt.b(android.content.Context):qpt");
    }

    public static qqs c(Context context) {
        return f(context).b(context);
    }

    public static qqs d(ea eaVar) {
        return f(eaVar.z()).c(eaVar);
    }

    public static qqs e(View view) {
        rhb f = f(view.getContext());
        if (rkh.m()) {
            return f.b(view.getContext().getApplicationContext());
        }
        rkf.f(view);
        rkf.e(view.getContext(), "Unable to obtain a request manager for a view without a Context");
        Activity a = rhb.a(view.getContext());
        if (a == null) {
            return f.b(view.getContext().getApplicationContext());
        }
        if (!(a instanceof eg)) {
            return f.b(view.getContext().getApplicationContext());
        }
        eg egVar = (eg) a;
        f.a.clear();
        rhb.e(egVar.a().p(), f.a);
        View findViewById = egVar.findViewById(R.id.content);
        ea eaVar = null;
        while (!view.equals(findViewById) && (eaVar = (ea) f.a.get(view)) == null && (view.getParent() instanceof View)) {
            view = (View) view.getParent();
        }
        f.a.clear();
        return eaVar != null ? f.c(eaVar) : f.d(egVar);
    }

    public static rhb f(Context context) {
        rkf.e(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return b(context).k;
    }

    private static GeneratedAppGlideModule j(Context context) {
        try {
            return (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext());
        } catch (ClassNotFoundException unused) {
            if (Log.isLoggable("Glide", 5)) {
                Log.w("Glide", "Failed to find GeneratedAppGlideModule. You should include an annotationProcessor compile dependency on com.github.bumptech.glide:compiler in your application and a @GlideModule annotated AppGlideModule implementation or LibraryGlideModules will be silently ignored");
                return null;
            }
            return null;
        } catch (IllegalAccessException e) {
            k(e);
            return null;
        } catch (InstantiationException e2) {
            k(e2);
            return null;
        } catch (NoSuchMethodException e3) {
            k(e3);
            return null;
        } catch (InvocationTargetException e4) {
            k(e4);
            return null;
        }
    }

    private static void k(Exception exc) {
        throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", exc);
    }

    public final Context a() {
        return this.c.getBaseContext();
    }

    public final void g() {
        rkh.i();
        this.j.f.a().b();
    }

    public final void h() {
        rkh.j();
        this.b.e();
        this.a.c();
        this.d.b();
    }

    public final void i(int i2) {
        rkh.j();
        synchronized (this.e) {
            for (qqs qqsVar : this.e) {
            }
        }
        Object obj = this.b;
        if (i2 >= 40) {
            ((rkc) obj).e();
        } else {
            if (i2 < 20) {
                if (i2 == 15) {
                    i2 = 15;
                }
            }
            rkc rkcVar = (rkc) obj;
            rkcVar.k(rkcVar.g() / 2);
        }
        this.a.f(i2);
        this.d.d(i2);
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        h();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        i(i2);
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }
}
