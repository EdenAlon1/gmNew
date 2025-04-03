package com.android.vcard;

import android.util.Log;
import defpackage.a;
import defpackage.emuz;
import defpackage.emye;
import defpackage.qnm;
import defpackage.qnn;
import defpackage.qno;
import j$.io.BufferedReaderRetargetInterface;
import j$.io.DesugarBufferedReader;
import j$.util.stream.Stream;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes.dex */
public class VCardParserImpl_V21 {
    protected final String a;
    protected String b;
    public CustomBufferedReader c;
    protected final Set d;
    protected final Set e;
    private final List f;
    private boolean g;

    /* compiled from: PG */
    protected static final class CustomBufferedReader extends BufferedReader implements BufferedReaderRetargetInterface {
        private String mNextLine;
        private boolean mNextLineIsValid;
        private long mTime;

        public CustomBufferedReader(Reader reader) {
            super(reader);
        }

        public long getTotalmillisecond() {
            return this.mTime;
        }

        @Override // java.io.BufferedReader, j$.io.BufferedReaderRetargetInterface
        public /* synthetic */ Stream lines() {
            return DesugarBufferedReader.lines(this);
        }

        public String peekLine() {
            if (!this.mNextLineIsValid) {
                long currentTimeMillis = System.currentTimeMillis();
                String readLine = super.readLine();
                this.mTime += System.currentTimeMillis() - currentTimeMillis;
                this.mNextLine = readLine;
                this.mNextLineIsValid = true;
            }
            return this.mNextLine;
        }

        @Override // java.io.BufferedReader
        public String readLine() {
            if (this.mNextLineIsValid) {
                String str = this.mNextLine;
                this.mNextLine = null;
                this.mNextLineIsValid = false;
                return str;
            }
            long currentTimeMillis = System.currentTimeMillis();
            String readLine = super.readLine();
            this.mTime += System.currentTimeMillis() - currentTimeMillis;
            return readLine;
        }

        @Override // java.io.BufferedReader
        public /* synthetic */ java.util.stream.Stream lines() {
            return Stream.Wrapper.convert(lines());
        }
    }

    public VCardParserImpl_V21() {
        this(null);
    }

    private final String v(String str) {
        if (!str.trim().endsWith("=")) {
            return str;
        }
        int length = str.length();
        while (str.charAt(length - 1) != '=') {
        }
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) str, 0, length);
        sb.append(VCardBuilder.VCARD_END_OF_LINE);
        while (true) {
            String c = c();
            if (c == null) {
                throw new qnn("File ended during parsing a Quoted-Printable String");
            }
            if (!c.trim().endsWith("=")) {
                sb.append(c);
                return sb.toString();
            }
            int length2 = c.length();
            while (c.charAt(length2 - 1) != '=') {
            }
            sb.append((CharSequence) c, 0, length2);
            sb.append(VCardBuilder.VCARD_END_OF_LINE);
        }
    }

    private final boolean w() {
        String c;
        this.b = VCardConstants.PARAM_ENCODING_8BIT;
        do {
            c = c();
            if (c == null) {
                return false;
            }
        } while (c.trim().length() <= 0);
        String[] split = c.split(":", 2);
        if (split.length != 2 || !emuz.e(split[0].trim(), VCardConstants.PROPERTY_BEGIN) || !emuz.e(split[1].trim(), "VCARD")) {
            throw new qnn(a.a(c, "Expected String \"BEGIN:VCARD\" did not come (Instead, \"", "\" came)"));
        }
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((VCardInterpreter) it.next()).onEntryStarted();
        }
        s();
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            ((VCardInterpreter) it2.next()).onEntryEnded();
        }
        return true;
    }

    private static final String x(String str) {
        int indexOf = str.indexOf(":");
        if (indexOf < 0) {
            return null;
        }
        int indexOf2 = str.indexOf(";");
        if (indexOf2 != -1) {
            indexOf = Math.min(indexOf, indexOf2);
        }
        return emuz.d(str.substring(0, indexOf));
    }

    private static final boolean y(char c) {
        if (c < 'a' || c > 'z') {
            return c >= 'A' && c <= 'Z';
        }
        return true;
    }

    protected int a() {
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0052, code lost:
    
        return r0.toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0036, code lost:
    
        android.util.Log.w(com.android.vcard.VCardEntryCommitter.LOG_TAG, "Found a next property during parsing a BASE64 string, which must not contain semi-colon or colon. Treat the line as next property.");
        android.util.Log.w(com.android.vcard.VCardEntryCommitter.LOG_TAG, "Problematic line: ".concat(java.lang.String.valueOf(r4.trim())));
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected java.lang.String b(java.lang.String r4) {
        /*
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r4)
        L8:
            java.lang.String r4 = r3.g()
            if (r4 == 0) goto L53
            java.lang.String r1 = x(r4)
            java.util.Set r2 = r3.h()
            boolean r2 = r2.contains(r1)
            if (r2 != 0) goto L36
            java.lang.String r2 = "X-ANDROID-CUSTOM"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L25
            goto L36
        L25:
            r3.c()
            int r1 = r4.length()
            if (r1 == 0) goto L4e
            java.lang.String r4 = r4.trim()
            r0.append(r4)
            goto L8
        L36:
            java.lang.String r1 = "Found a next property during parsing a BASE64 string, which must not contain semi-colon or colon. Treat the line as next property."
            java.lang.String r2 = "vCard"
            android.util.Log.w(r2, r1)
            java.lang.String r4 = r4.trim()
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r1 = "Problematic line: "
            java.lang.String r4 = r1.concat(r4)
            android.util.Log.w(r2, r4)
        L4e:
            java.lang.String r4 = r0.toString()
            return r4
        L53:
            qnn r4 = new qnn
            java.lang.String r0 = "File ended during parsing BASE64 binary"
            r4.<init>(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.vcard.VCardParserImpl_V21.b(java.lang.String):java.lang.String");
    }

    protected String c() {
        return this.c.readLine();
    }

    protected String d() {
        String c;
        do {
            c = c();
            if (c == null) {
                throw new qnn("Reached end of buffer.");
            }
        } while (c.trim().length() <= 0);
        return c;
    }

    protected String e() {
        return VCardConstants.VERSION_V21;
    }

    protected final String g() {
        return this.c.peekLine();
    }

    protected Set h() {
        return VCardParser_V21.sKnownPropertyNameSet;
    }

    public final void i(VCardInterpreter vCardInterpreter) {
        this.f.add(vCardInterpreter);
    }

    public final synchronized void j() {
        Log.i(VCardEntryCommitter.LOG_TAG, "ParserImpl received cancel operation.");
        this.g = true;
    }

    public final void k(VCardProperty vCardProperty) {
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((VCardInterpreter) it.next()).onPropertyCreated(vCardProperty);
        }
    }

    protected void l(VCardProperty vCardProperty) {
        if (emuz.d(vCardProperty.getRawValue()).contains("BEGIN:VCARD")) {
            throw new qnm(null);
        }
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((VCardInterpreter) it.next()).onPropertyCreated(vCardProperty);
        }
    }

    protected void m(VCardProperty vCardProperty, String str, String str2) {
        vCardProperty.addParameter(str, str2);
    }

    protected void n(VCardProperty vCardProperty, String str) {
        q(vCardProperty, str);
    }

    public void o(VCardProperty vCardProperty, String str) {
        String[] split = str.split("=", 2);
        if (split.length != 2) {
            n(vCardProperty, split[0]);
            return;
        }
        String d = emuz.d(split[0].trim());
        String trim = split[1].trim();
        if (d.equals(VCardConstants.PARAM_TYPE)) {
            q(vCardProperty, trim);
            return;
        }
        if (d.equals(VCardConstants.PARAM_VALUE)) {
            if (!VCardParser_V21.sKnownValueSet.contains(emuz.d(trim)) && !trim.startsWith("X-") && !this.e.contains(trim)) {
                this.e.add(trim);
                Log.w(VCardEntryCommitter.LOG_TAG, String.format("The value unsupported by TYPE of %s: %s", Integer.valueOf(a()), trim));
            }
            vCardProperty.addParameter(VCardConstants.PARAM_VALUE, trim);
            return;
        }
        if (d.equals(VCardConstants.PARAM_ENCODING)) {
            String d2 = emuz.d(trim);
            if (!VCardParser_V21.sAvailableEncoding.contains(d2) && !d2.startsWith("X-")) {
                throw new qnn(a.a(d2, "Unknown encoding \"", "\""));
            }
            vCardProperty.addParameter(VCardConstants.PARAM_ENCODING, d2);
            this.b = emuz.d(d2);
            return;
        }
        if (d.equals(VCardConstants.PARAM_CHARSET)) {
            vCardProperty.addParameter(VCardConstants.PARAM_CHARSET, trim);
            return;
        }
        if (!d.equals(VCardConstants.PARAM_LANGUAGE)) {
            if (!d.startsWith("X-")) {
                throw new qnn(a.a(d, "Unknown type \"", "\""));
            }
            m(vCardProperty, d, trim);
            return;
        }
        List i = emye.b('-').i(trim);
        if (i.size() != 2) {
            throw new qnn(a.a(trim, "Invalid Language: \"", "\""));
        }
        String str2 = (String) i.get(0);
        int length = str2.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!y(str2.charAt(i2))) {
                throw new qnn(a.a(trim, "Invalid Language: \"", "\""));
            }
        }
        String str3 = (String) i.get(1);
        int length2 = str3.length();
        for (int i3 = 0; i3 < length2; i3++) {
            if (!y(str3.charAt(i3))) {
                throw new qnn(a.a(trim, "Invalid Language: \"", "\""));
            }
        }
        vCardProperty.addParameter(VCardConstants.PARAM_LANGUAGE, trim);
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x00ee, code lost:
    
        r0 = r2.toString();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void p(com.android.vcard.VCardProperty r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 460
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.vcard.VCardParserImpl_V21.p(com.android.vcard.VCardProperty, java.lang.String):void");
    }

    public void q(VCardProperty vCardProperty, String str) {
        if (!VCardParser_V21.sKnownTypeSet.contains(emuz.d(str)) && !str.startsWith("X-") && !this.d.contains(str)) {
            this.d.add(str);
            Log.w(VCardEntryCommitter.LOG_TAG, String.format("TYPE unsupported by %s: %s", Integer.valueOf(a()), str));
        }
        vCardProperty.addParameter(VCardConstants.PARAM_TYPE, str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0021, code lost:
    
        android.util.Log.i(com.android.vcard.VCardEntryCommitter.LOG_TAG, "Cancel request has come. exitting parse operation.");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void r(java.io.InputStream r3) {
        /*
            r2 = this;
            if (r3 == 0) goto L55
            java.lang.String r0 = r2.a
            java.io.InputStreamReader r1 = new java.io.InputStreamReader
            r1.<init>(r3, r0)
            com.android.vcard.VCardParserImpl_V21$CustomBufferedReader r3 = new com.android.vcard.VCardParserImpl_V21$CustomBufferedReader
            r3.<init>(r1)
            r2.c = r3
            java.util.List r3 = r2.f
            java.util.Iterator r3 = r3.iterator()
        L16:
            boolean r0 = r3.hasNext()
            if (r0 != 0) goto L4b
        L1c:
            monitor-enter(r2)
            boolean r3 = r2.g     // Catch: java.lang.Throwable -> L48
            if (r3 == 0) goto L2a
            java.lang.String r3 = "vCard"
            java.lang.String r0 = "Cancel request has come. exitting parse operation."
            android.util.Log.i(r3, r0)     // Catch: java.lang.Throwable -> L48
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L48
            goto L31
        L2a:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L48
            boolean r3 = r2.w()
            if (r3 != 0) goto L1c
        L31:
            java.util.List r3 = r2.f
            java.util.Iterator r3 = r3.iterator()
        L37:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L47
            java.lang.Object r0 = r3.next()
            com.android.vcard.VCardInterpreter r0 = (com.android.vcard.VCardInterpreter) r0
            r0.onVCardEnded()
            goto L37
        L47:
            return
        L48:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L48
            throw r3
        L4b:
            java.lang.Object r0 = r3.next()
            com.android.vcard.VCardInterpreter r0 = (com.android.vcard.VCardInterpreter) r0
            r0.onVCardStarted()
            goto L16
        L55:
            java.lang.NullPointerException r3 = new java.lang.NullPointerException
            java.lang.String r0 = "InputStream must not be null."
            r3.<init>(r0)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.vcard.VCardParserImpl_V21.r(java.io.InputStream):void");
    }

    protected final void s() {
        boolean z;
        try {
            z = u();
        } catch (qno unused) {
            Log.e(VCardEntryCommitter.LOG_TAG, "Invalid line which looks like some comment was found. Ignored.");
            z = false;
        }
        while (!z) {
            try {
                z = u();
            } catch (qno unused2) {
                Log.e(VCardEntryCommitter.LOG_TAG, "Invalid line which looks like some comment was found. Ignored.");
            }
        }
    }

    public final void t(InputStream inputStream) {
        if (inputStream == null) {
            throw new NullPointerException("InputStream must not be null.");
        }
        this.c = new CustomBufferedReader(new InputStreamReader(inputStream, this.a));
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            ((VCardInterpreter) it.next()).onVCardStarted();
        }
        w();
        Iterator it2 = this.f.iterator();
        while (it2.hasNext()) {
            ((VCardInterpreter) it2.next()).onVCardEnded();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    protected final boolean u() {
        /*
            Method dump skipped, instructions count: 480
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.vcard.VCardParserImpl_V21.u():boolean");
    }

    public VCardParserImpl_V21(byte[] bArr) {
        this.f = new ArrayList();
        this.d = new HashSet();
        this.e = new HashSet();
        this.a = VCardConfig.DEFAULT_INTERMEDIATE_CHARSET;
    }

    protected String f(String str) {
        return str;
    }
}
