package defpackage;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteException;
import android.drm.DrmConvertedStatus;
import android.net.Uri;
import android.provider.Telephony;
import android.telephony.PhoneNumberUtils;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion;
import j$.time.Duration;
import j$.time.Instant;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final class cgtc {
    public static final SparseIntArray c;
    public static final SparseIntArray d;
    public static final SparseIntArray e;
    public static final SparseIntArray f;
    public static final SparseIntArray g;
    private static final cpn l;
    private static final SparseArray m;
    private static final SparseArray n;
    private static final SparseArray o;
    private static final SparseArray p;
    private static final SparseArray q;
    public final ContentResolver h;
    public final albq i;
    private final Context r;
    private final cqoh s;
    private final covs t;
    private final cpdg u;
    private final ffbr v;
    private static final byte[] j = new byte[0];
    private static final int[] k = {129, 130, 137, 151};
    public static final String[] a = {"_id", "msg_box", "thread_id", "retr_txt", "sub", "ct_l", "ct_t", "m_cls", "m_id", "resp_txt", "tr_id", "ct_cls", "d_rpt", "m_type", "v", "pri", "rr", "read_status", "rpt_a", "retr_st", "st", "date", "d_tm", "exp", "m_size", "sub_cs", "retr_txt_cs", "read", "seen"};
    public static final String[] b = {"_id", "chset", "cd", "cid", "cl", "ct", "fn", "name", ConversationSuggestion.SUGGESTION_PROPERTY_TEXT};

    static {
        cpn cpnVar = new cpn();
        l = cpnVar;
        cpnVar.put(Telephony.Mms.Inbox.CONTENT_URI, 1);
        cpnVar.put(Telephony.Mms.Sent.CONTENT_URI, 2);
        cpnVar.put(Telephony.Mms.Draft.CONTENT_URI, 3);
        cpnVar.put(Telephony.Mms.Outbox.CONTENT_URI, 4);
        SparseIntArray sparseIntArray = new SparseIntArray();
        c = sparseIntArray;
        sparseIntArray.put(150, 25);
        sparseIntArray.put(154, 26);
        SparseArray sparseArray = new SparseArray();
        m = sparseArray;
        sparseArray.put(150, "sub_cs");
        sparseArray.put(154, "retr_txt_cs");
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        d = sparseIntArray2;
        sparseIntArray2.put(154, 3);
        sparseIntArray2.put(150, 4);
        SparseArray sparseArray2 = new SparseArray();
        n = sparseArray2;
        sparseArray2.put(154, "retr_txt");
        sparseArray2.put(150, "sub");
        SparseIntArray sparseIntArray3 = new SparseIntArray();
        e = sparseIntArray3;
        sparseIntArray3.put(131, 5);
        sparseIntArray3.put(132, 6);
        sparseIntArray3.put(138, 7);
        sparseIntArray3.put(139, 8);
        sparseIntArray3.put(147, 9);
        sparseIntArray3.put(152, 10);
        SparseArray sparseArray3 = new SparseArray();
        o = sparseArray3;
        sparseArray3.put(131, "ct_l");
        sparseArray3.put(132, "ct_t");
        sparseArray3.put(138, "m_cls");
        sparseArray3.put(139, "m_id");
        sparseArray3.put(147, "resp_txt");
        sparseArray3.put(152, "tr_id");
        SparseIntArray sparseIntArray4 = new SparseIntArray();
        f = sparseIntArray4;
        sparseIntArray4.put(186, 11);
        sparseIntArray4.put(134, 12);
        sparseIntArray4.put(140, 13);
        sparseIntArray4.put(141, 14);
        sparseIntArray4.put(143, 15);
        sparseIntArray4.put(144, 16);
        sparseIntArray4.put(155, 17);
        sparseIntArray4.put(145, 18);
        sparseIntArray4.put(153, 19);
        sparseIntArray4.put(149, 20);
        SparseArray sparseArray4 = new SparseArray();
        p = sparseArray4;
        sparseArray4.put(186, "ct_cls");
        sparseArray4.put(134, "d_rpt");
        sparseArray4.put(140, "m_type");
        sparseArray4.put(141, "v");
        sparseArray4.put(143, "pri");
        sparseArray4.put(144, "rr");
        sparseArray4.put(155, "read_status");
        sparseArray4.put(145, "rpt_a");
        sparseArray4.put(153, "retr_st");
        sparseArray4.put(149, "st");
        SparseIntArray sparseIntArray5 = new SparseIntArray();
        g = sparseIntArray5;
        sparseIntArray5.put(133, 21);
        sparseIntArray5.put(135, 22);
        sparseIntArray5.put(136, 23);
        sparseIntArray5.put(142, 24);
        SparseArray sparseArray5 = new SparseArray();
        q = sparseArray5;
        sparseArray5.put(133, "date");
        sparseArray5.put(135, "d_tm");
        sparseArray5.put(136, "exp");
        sparseArray5.put(142, "m_size");
    }

    public cgtc(Context context, albq albqVar, cqoh cqohVar, covs covsVar, cpdg cpdgVar, ffbr ffbrVar) {
        this.r = context;
        this.h = context.getContentResolver();
        this.i = albqVar;
        this.s = cqohVar;
        this.t = covsVar;
        this.u = cpdgVar;
        this.v = ffbrVar;
    }

    public static Uri a(long j2) {
        return Uri.parse(a.y(j2, "content://mms/", "/part"));
    }

    public static String c(byte[] bArr) {
        try {
            return new String(bArr, "iso-8859-1");
        } catch (UnsupportedEncodingException e2) {
            csjy.h("Bugle", e2, "PduPersister: ISO_8859_1 must be supported!");
            return "";
        }
    }

    public static HashSet d(String str, Collection collection) {
        HashSet hashSet = new HashSet();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            if (TextUtils.isEmpty(str) || !PhoneNumberUtils.compare(str2, str)) {
                if (!hashSet.contains(str2)) {
                    hashSet.add(str2);
                }
            }
        }
        if (collection.size() != hashSet.size() || str == null) {
            csjy.c("Bugle", "successfully removed self from mms");
            return hashSet;
        }
        csjy.j("Bugle", "Did not remove self %s from mms", cskt.b(str));
        return hashSet;
    }

    public static byte[] e(Cursor cursor, int i) {
        if (cursor.isNull(i)) {
            return null;
        }
        return f(cursor.getString(i));
    }

    public static byte[] f(String str) {
        try {
            return str.getBytes("iso-8859-1");
        } catch (UnsupportedEncodingException e2) {
            csjy.h("Bugle", e2, "PduPersister: ISO_8859_1 must be supported!");
            return new byte[0];
        }
    }

    private static String i(Context context, Uri uri) {
        String scheme = uri.getScheme();
        if (scheme == null || scheme.isEmpty() || scheme.equals("file")) {
            return uri.getPath();
        }
        if (scheme.equals("http")) {
            return uri.toString();
        }
        if (!scheme.equals("content")) {
            throw new IllegalArgumentException("Given Uri scheme is not supported");
        }
        try {
            try {
                Cursor query = context.getContentResolver().query(uri, new String[]{"_data"}, null, null, null);
                if (query == null || query.getCount() == 0 || !query.moveToFirst()) {
                    throw new IllegalArgumentException("Given Uri could not be found in media store");
                }
                String string = query.getString(query.getColumnIndexOrThrow("_data"));
                query.close();
                return string;
            } catch (SQLiteException e2) {
                throw new IllegalArgumentException("Given Uri is not formatted in a way so that it can be found in media store.", e2);
            }
        } finally {
        }
    }

    private static String j(lt ltVar) {
        if (ltVar.n() == null) {
            return null;
        }
        return c(ltVar.n());
    }

    private static void k(OutputStream outputStream, InputStream inputStream) {
        if (outputStream != null) {
            try {
                outputStream.close();
            } catch (IOException e2) {
                csjy.h("Bugle", e2, "PduPersister: IOException while closing: ".concat(outputStream.toString()));
            }
        }
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e3) {
                csjy.h("Bugle", e3, "IOException while closing: ".concat(inputStream.toString()));
            }
        }
    }

    private final void l(int i, HashSet hashSet, SparseArray sparseArray) {
        lg[] lgVarArr = (lg[]) sparseArray.get(i);
        if (lgVarArr != null) {
            for (lg lgVar : lgVarArr) {
                if (lgVar != null) {
                    String e2 = this.u.e(lgVar.b());
                    if (!hashSet.contains(e2)) {
                        hashSet.add(e2);
                    }
                }
            }
        }
    }

    private final void m(String str, long j2, long j3) {
        cpaf cpafVar = (cpaf) this.v.b();
        Duration between = Duration.between(Instant.ofEpochMilli(j3), this.s.f());
        between.getClass();
        axnw.h(axol.i(cpafVar.b, new cpae(cpafVar, str, j2, between, null)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:264:0x0303, code lost:
    
        r0 = new android.content.ContentValues();
        r0.put(com.google.android.ims.rcsservice.chatsession.message.ConversationSuggestion.SUGGESTION_PROPERTY_TEXT, new defpackage.lg(r12, (defpackage.eyee) r6).b());
        r3 = r22.i.b("Bugle.Telephony.Update.Mms.Text.Latency");
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x0320, code lost:
    
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:267:0x0321, code lost:
    
        r0 = r22.h.update(r24, r0, null, null);
        r3.c();
     */
    /* JADX WARN: Code restructure failed: missing block: B:268:0x0329, code lost:
    
        if (r0 != 1) goto L215;
     */
    /* JADX WARN: Code restructure failed: missing block: B:272:0x0337, code lost:
    
        throw new defpackage.lj(defpackage.a.G(r24, "unable to update "));
     */
    /* JADX WARN: Code restructure failed: missing block: B:274:0x033e, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:275:0x039e, code lost:
    
        r11 = r5;
        r13 = r11;
        r19 = r13;
        r2 = r2;
        r5 = r5;
        r13 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:276:0x033c, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:277:0x037b, code lost:
    
        r11 = r5;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:278:0x033a, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0356, code lost:
    
        r11 = r5;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x0338, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x034f, code lost:
    
        r9 = r5;
        r11 = r9;
        r13 = r11;
        r5 = r5;
        r11 = r11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0165 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x013c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:233:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x03c2  */
    /* JADX WARN: Type inference failed for: r11v10, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v18 */
    /* JADX WARN: Type inference failed for: r11v25 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r11v33 */
    /* JADX WARN: Type inference failed for: r11v39 */
    /* JADX WARN: Type inference failed for: r11v4, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r11v40 */
    /* JADX WARN: Type inference failed for: r11v41 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean] */
    /* JADX WARN: Type inference failed for: r12v10 */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3 */
    /* JADX WARN: Type inference failed for: r12v32, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r12v4 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6 */
    /* JADX WARN: Type inference failed for: r12v7 */
    /* JADX WARN: Type inference failed for: r12v8 */
    /* JADX WARN: Type inference failed for: r12v9 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v10, types: [cgtl] */
    /* JADX WARN: Type inference failed for: r13v16 */
    /* JADX WARN: Type inference failed for: r13v32 */
    /* JADX WARN: Type inference failed for: r13v37 */
    /* JADX WARN: Type inference failed for: r13v38 */
    /* JADX WARN: Type inference failed for: r13v4, types: [cgtl] */
    /* JADX WARN: Type inference failed for: r13v42 */
    /* JADX WARN: Type inference failed for: r13v43 */
    /* JADX WARN: Type inference failed for: r13v46 */
    /* JADX WARN: Type inference failed for: r13v58 */
    /* JADX WARN: Type inference failed for: r13v63, types: [cgtl] */
    /* JADX WARN: Type inference failed for: r13v64 */
    /* JADX WARN: Type inference failed for: r13v65 */
    /* JADX WARN: Type inference failed for: r13v66 */
    /* JADX WARN: Type inference failed for: r13v71 */
    /* JADX WARN: Type inference failed for: r13v72 */
    /* JADX WARN: Type inference failed for: r13v73 */
    /* JADX WARN: Type inference failed for: r13v74 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r22v0, types: [cgtc] */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v30 */
    /* JADX WARN: Type inference failed for: r2v31 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v33 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v35 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v37, types: [int] */
    /* JADX WARN: Type inference failed for: r2v43 */
    /* JADX WARN: Type inference failed for: r2v44 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r5v15, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v23 */
    /* JADX WARN: Type inference failed for: r5v29 */
    /* JADX WARN: Type inference failed for: r5v33 */
    /* JADX WARN: Type inference failed for: r5v37 */
    /* JADX WARN: Type inference failed for: r5v38 */
    /* JADX WARN: Type inference failed for: r5v46 */
    /* JADX WARN: Type inference failed for: r5v53 */
    /* JADX WARN: Type inference failed for: r5v58 */
    /* JADX WARN: Type inference failed for: r5v59 */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r6v2, types: [eyee] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void n(defpackage.lt r23, android.net.Uri r24, java.lang.String r25, java.util.Map r26) {
        /*
            Method dump skipped, instructions count: 966
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgtc.n(lt, android.net.Uri, java.lang.String, java.util.Map):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r5v5 */
    private final void o(cgtl cgtlVar, String str) {
        RandomAccessFile randomAccessFile;
        String a2;
        try {
            DrmConvertedStatus closeConvertSession = cgtlVar.a.closeConvertSession(cgtlVar.b);
            if (closeConvertSession != null && closeConvertSession.statusCode == 1) {
                RandomAccessFile randomAccessFile2 = closeConvertSession.convertedData;
                try {
                    if (randomAccessFile2 != 0) {
                        try {
                            randomAccessFile = new RandomAccessFile(str, "rw");
                            try {
                                randomAccessFile.seek(closeConvertSession.offset);
                                randomAccessFile.write(closeConvertSession.convertedData);
                                try {
                                    randomAccessFile.close();
                                } catch (IOException e2) {
                                    e = e2;
                                    a2 = a.a(str, "Failed to close File:", ".");
                                    Log.w("DrmConvertSession", a2, e);
                                    File file = new File(str);
                                    ContentValues contentValues = new ContentValues(0);
                                    albq albqVar = this.i;
                                    ContentResolver contentResolver = this.h;
                                    akzw b2 = albqVar.b("Bugle.Telephony.Update.Part.PERMISSIONS.Latency");
                                    cgsx.b(contentResolver, Uri.parse("content://mms/resetFilePerm/".concat(String.valueOf(file.getName()))), contentValues, null, null);
                                    b2.c();
                                }
                            } catch (FileNotFoundException e3) {
                                e = e3;
                                Log.w("DrmConvertSession", a.a(str, "File: ", " could not be found."), e);
                                if (randomAccessFile != null) {
                                    try {
                                        randomAccessFile.close();
                                    } catch (IOException e4) {
                                        e = e4;
                                        a2 = a.a(str, "Failed to close File:", ".");
                                        Log.w("DrmConvertSession", a2, e);
                                        File file2 = new File(str);
                                        ContentValues contentValues2 = new ContentValues(0);
                                        albq albqVar2 = this.i;
                                        ContentResolver contentResolver2 = this.h;
                                        akzw b22 = albqVar2.b("Bugle.Telephony.Update.Part.PERMISSIONS.Latency");
                                        cgsx.b(contentResolver2, Uri.parse("content://mms/resetFilePerm/".concat(String.valueOf(file2.getName()))), contentValues2, null, null);
                                        b22.c();
                                    }
                                }
                                File file22 = new File(str);
                                ContentValues contentValues22 = new ContentValues(0);
                                albq albqVar22 = this.i;
                                ContentResolver contentResolver22 = this.h;
                                akzw b222 = albqVar22.b("Bugle.Telephony.Update.Part.PERMISSIONS.Latency");
                                cgsx.b(contentResolver22, Uri.parse("content://mms/resetFilePerm/".concat(String.valueOf(file22.getName()))), contentValues22, null, null);
                                b222.c();
                            } catch (IOException e5) {
                                e = e5;
                                Log.w("DrmConvertSession", a.a(str, "Could not access File: ", " ."), e);
                                if (randomAccessFile != null) {
                                    try {
                                        randomAccessFile.close();
                                    } catch (IOException e6) {
                                        e = e6;
                                        a2 = a.a(str, "Failed to close File:", ".");
                                        Log.w("DrmConvertSession", a2, e);
                                        File file222 = new File(str);
                                        ContentValues contentValues222 = new ContentValues(0);
                                        albq albqVar222 = this.i;
                                        ContentResolver contentResolver222 = this.h;
                                        akzw b2222 = albqVar222.b("Bugle.Telephony.Update.Part.PERMISSIONS.Latency");
                                        cgsx.b(contentResolver222, Uri.parse("content://mms/resetFilePerm/".concat(String.valueOf(file222.getName()))), contentValues222, null, null);
                                        b2222.c();
                                    }
                                }
                                File file2222 = new File(str);
                                ContentValues contentValues2222 = new ContentValues(0);
                                albq albqVar2222 = this.i;
                                ContentResolver contentResolver2222 = this.h;
                                akzw b22222 = albqVar2222.b("Bugle.Telephony.Update.Part.PERMISSIONS.Latency");
                                cgsx.b(contentResolver2222, Uri.parse("content://mms/resetFilePerm/".concat(String.valueOf(file2222.getName()))), contentValues2222, null, null);
                                b22222.c();
                            } catch (IllegalArgumentException e7) {
                                e = e7;
                                Log.w("DrmConvertSession", "Could not open file in mode: rw", e);
                                if (randomAccessFile != null) {
                                    try {
                                        randomAccessFile.close();
                                    } catch (IOException e8) {
                                        e = e8;
                                        a2 = a.a(str, "Failed to close File:", ".");
                                        Log.w("DrmConvertSession", a2, e);
                                        File file22222 = new File(str);
                                        ContentValues contentValues22222 = new ContentValues(0);
                                        albq albqVar22222 = this.i;
                                        ContentResolver contentResolver22222 = this.h;
                                        akzw b222222 = albqVar22222.b("Bugle.Telephony.Update.Part.PERMISSIONS.Latency");
                                        cgsx.b(contentResolver22222, Uri.parse("content://mms/resetFilePerm/".concat(String.valueOf(file22222.getName()))), contentValues22222, null, null);
                                        b222222.c();
                                    }
                                }
                                File file222222 = new File(str);
                                ContentValues contentValues222222 = new ContentValues(0);
                                albq albqVar222222 = this.i;
                                ContentResolver contentResolver222222 = this.h;
                                akzw b2222222 = albqVar222222.b("Bugle.Telephony.Update.Part.PERMISSIONS.Latency");
                                cgsx.b(contentResolver222222, Uri.parse("content://mms/resetFilePerm/".concat(String.valueOf(file222222.getName()))), contentValues222222, null, null);
                                b2222222.c();
                            } catch (SecurityException e9) {
                                e = e9;
                                Log.w("DrmConvertSession", a.a(str, "Access to File: ", " was denied denied by SecurityManager."), e);
                                if (randomAccessFile != null) {
                                    try {
                                        randomAccessFile.close();
                                    } catch (IOException e10) {
                                        e = e10;
                                        a2 = a.a(str, "Failed to close File:", ".");
                                        Log.w("DrmConvertSession", a2, e);
                                        File file2222222 = new File(str);
                                        ContentValues contentValues2222222 = new ContentValues(0);
                                        albq albqVar2222222 = this.i;
                                        ContentResolver contentResolver2222222 = this.h;
                                        akzw b22222222 = albqVar2222222.b("Bugle.Telephony.Update.Part.PERMISSIONS.Latency");
                                        cgsx.b(contentResolver2222222, Uri.parse("content://mms/resetFilePerm/".concat(String.valueOf(file2222222.getName()))), contentValues2222222, null, null);
                                        b22222222.c();
                                    }
                                }
                                File file22222222 = new File(str);
                                ContentValues contentValues22222222 = new ContentValues(0);
                                albq albqVar22222222 = this.i;
                                ContentResolver contentResolver22222222 = this.h;
                                akzw b222222222 = albqVar22222222.b("Bugle.Telephony.Update.Part.PERMISSIONS.Latency");
                                cgsx.b(contentResolver22222222, Uri.parse("content://mms/resetFilePerm/".concat(String.valueOf(file22222222.getName()))), contentValues22222222, null, null);
                                b222222222.c();
                            }
                        } catch (FileNotFoundException e11) {
                            e = e11;
                            randomAccessFile = null;
                        } catch (IOException e12) {
                            e = e12;
                            randomAccessFile = null;
                        } catch (IllegalArgumentException e13) {
                            e = e13;
                            randomAccessFile = null;
                        } catch (SecurityException e14) {
                            e = e14;
                            randomAccessFile = null;
                        } catch (Throwable th) {
                            th = th;
                            randomAccessFile2 = 0;
                            if (randomAccessFile2 != 0) {
                                try {
                                    randomAccessFile2.close();
                                } catch (IOException e15) {
                                    Log.w("DrmConvertSession", a.a(str, "Failed to close File:", "."), e15);
                                }
                            }
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            }
        } catch (IllegalStateException e16) {
            Log.w("DrmConvertSession", "Could not close convertsession. Convertsession: " + cgtlVar.b, e16);
        }
        File file222222222 = new File(str);
        ContentValues contentValues222222222 = new ContentValues(0);
        albq albqVar222222222 = this.i;
        ContentResolver contentResolver222222222 = this.h;
        akzw b2222222222 = albqVar222222222.b("Bugle.Telephony.Update.Part.PERMISSIONS.Latency");
        cgsx.b(contentResolver222222222, Uri.parse("content://mms/resetFilePerm/".concat(String.valueOf(file222222222.getName()))), contentValues222222222, null, null);
        b2222222222.c();
    }

    private final void p(InputStream inputStream, boolean z, OutputStream outputStream, cgtl cgtlVar, String str) {
        byte[] bArr = new byte[8192];
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return;
            }
            if (z) {
                byte[] b2 = cgtlVar.b(bArr, read);
                if (b2 == null) {
                    throw new lj("Error converting drm data.");
                }
                long epochMilli = this.s.f().toEpochMilli();
                int length = b2.length;
                outputStream.write(b2, 0, length);
                m(str, length, epochMilli);
            } else {
                outputStream.write(bArr, 0, read);
            }
        }
    }

    private final void q(String str, long j2, int i) {
        cpaf cpafVar = (cpaf) this.v.b();
        axnw.h(axol.i(cpafVar.b, new cpac(cpafVar, str, j2, i, null)));
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x0133 A[Catch: all -> 0x014c, TRY_LEAVE, TryCatch #3 {all -> 0x014c, blocks: (B:3:0x000a, B:6:0x0023, B:7:0x003a, B:10:0x0045, B:12:0x0062, B:15:0x006c, B:18:0x0074, B:20:0x0085, B:22:0x0095, B:23:0x00ab, B:25:0x00b8, B:26:0x00c2, B:28:0x00c8, B:29:0x00d2, B:31:0x00d8, B:32:0x00e2, B:34:0x00ee, B:35:0x00f7, B:37:0x00fd, B:38:0x0106, B:40:0x010c, B:42:0x0115, B:44:0x0123, B:46:0x0133, B:50:0x013c, B:51:0x0143, B:54:0x012c, B:58:0x0144, B:59:0x014b, B:60:0x002b, B:62:0x0031), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x013c A[Catch: all -> 0x014c, TRY_ENTER, TryCatch #3 {all -> 0x014c, blocks: (B:3:0x000a, B:6:0x0023, B:7:0x003a, B:10:0x0045, B:12:0x0062, B:15:0x006c, B:18:0x0074, B:20:0x0085, B:22:0x0095, B:23:0x00ab, B:25:0x00b8, B:26:0x00c2, B:28:0x00c8, B:29:0x00d2, B:31:0x00d8, B:32:0x00e2, B:34:0x00ee, B:35:0x00f7, B:37:0x00fd, B:38:0x0106, B:40:0x010c, B:42:0x0115, B:44:0x0123, B:46:0x0133, B:50:0x013c, B:51:0x0143, B:54:0x012c, B:58:0x0144, B:59:0x014b, B:60:0x002b, B:62:0x0031), top: B:2:0x000a }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri b(defpackage.lt r11, long r12, java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgtc.b(lt, long, java.util.Map):android.net.Uri");
    }

    public final boolean g(long j2) {
        ekzz f2 = eleg.f("PduPersister.deleteAttachmentIfPresent");
        try {
            boolean z = cgsx.a(this.h, a(j2), "cid=?", new String[]{"<file_transfer_thumbnail>"}) > 0;
            f2.close();
            return z;
        } catch (Throwable th) {
            try {
                f2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x03d3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x045a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x04a8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04d8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04fa  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x047a  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0445  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x037e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.net.Uri h(defpackage.lh r24, android.net.Uri r25, int r26, java.lang.String r27, long r28, java.util.Map r30) {
        /*
            Method dump skipped, instructions count: 1408
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.cgtc.h(lh, android.net.Uri, int, java.lang.String, long, java.util.Map):android.net.Uri");
    }
}
