package defpackage;

import android.text.SpannableStringBuilder;

/* compiled from: PG */
/* loaded from: classes.dex */
public final class kse {
    static final ksg a;
    static final kse b;
    static final kse c;
    public static final /* synthetic */ int d = 0;
    private static final String e;
    private static final String f;
    private final boolean g;
    private final int h;
    private final ksg i;

    static {
        ksg ksgVar = ksk.c;
        a = ksgVar;
        e = Character.toString((char) 8206);
        f = Character.toString((char) 8207);
        b = new kse(false, 2, ksgVar);
        c = new kse(true, 2, ksgVar);
    }

    public kse(boolean z, int i, ksg ksgVar) {
        this.g = z;
        this.h = i;
        this.i = ksgVar;
    }

    public static kse a() {
        return new ksc().a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x0067, code lost:
    
        if (r1 != 0) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0069, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x006a, code lost:
    
        if (r2 != 0) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x006e, code lost:
    
        if (r0.c <= 0) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x0074, code lost:
    
        switch(r0.a()) {
            case 14: goto L62;
            case 15: goto L62;
            case 16: goto L61;
            case 17: goto L61;
            case 18: goto L60;
            default: goto L67;
        };
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0078, code lost:
    
        r3 = r3 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x007b, code lost:
    
        if (r1 != r3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x0081, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x007d, code lost:
    
        return 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x007e, code lost:
    
        if (r1 != r3) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0080, code lost:
    
        return -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0084, code lost:
    
        return 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0085, code lost:
    
        return r2;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int d(java.lang.CharSequence r9) {
        /*
            ksd r0 = new ksd
            r0.<init>(r9)
            r9 = 0
            r0.c = r9
            r1 = r9
            r2 = r1
            r3 = r2
        Lb:
            int r4 = r0.c
            int r5 = r0.b
            r6 = -1
            r7 = 1
            if (r4 >= r5) goto L67
            if (r1 != 0) goto L67
            java.lang.CharSequence r5 = r0.a
            char r4 = r5.charAt(r4)
            r0.d = r4
            boolean r4 = java.lang.Character.isHighSurrogate(r4)
            if (r4 == 0) goto L39
            java.lang.CharSequence r4 = r0.a
            int r5 = r0.c
            int r4 = java.lang.Character.codePointAt(r4, r5)
            int r5 = r0.c
            int r8 = java.lang.Character.charCount(r4)
            int r5 = r5 + r8
            r0.c = r5
            byte r4 = java.lang.Character.getDirectionality(r4)
            goto L44
        L39:
            int r4 = r0.c
            int r4 = r4 + r7
            r0.c = r4
            char r4 = r0.d
            byte r4 = defpackage.ksd.b(r4)
        L44:
            if (r4 == 0) goto L62
            if (r4 == r7) goto L5f
            r5 = 2
            if (r4 == r5) goto L5f
            r5 = 9
            if (r4 == r5) goto Lb
            switch(r4) {
                case 14: goto L5b;
                case 15: goto L5b;
                case 16: goto L57;
                case 17: goto L57;
                case 18: goto L53;
                default: goto L52;
            }
        L52:
            goto L65
        L53:
            int r3 = r3 + (-1)
            r2 = r9
            goto Lb
        L57:
            int r3 = r3 + 1
            r2 = r7
            goto Lb
        L5b:
            int r3 = r3 + 1
            r2 = r6
            goto Lb
        L5f:
            if (r3 != 0) goto L65
            return r7
        L62:
            if (r3 != 0) goto L65
            return r6
        L65:
            r1 = r3
            goto Lb
        L67:
            if (r1 != 0) goto L6a
            return r9
        L6a:
            if (r2 != 0) goto L85
        L6c:
            int r2 = r0.c
            if (r2 <= 0) goto L84
            byte r2 = r0.a()
            switch(r2) {
                case 14: goto L7e;
                case 15: goto L7e;
                case 16: goto L7b;
                case 17: goto L7b;
                case 18: goto L78;
                default: goto L77;
            }
        L77:
            goto L6c
        L78:
            int r3 = r3 + 1
            goto L6c
        L7b:
            if (r1 != r3) goto L81
            return r7
        L7e:
            if (r1 != r3) goto L81
            return r6
        L81:
            int r3 = r3 + (-1)
            goto L6c
        L84:
            return r9
        L85:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kse.d(java.lang.CharSequence):int");
    }

    private static int e(CharSequence charSequence) {
        ksd ksdVar = new ksd(charSequence);
        ksdVar.c = ksdVar.b;
        int i = 0;
        while (true) {
            int i2 = i;
            while (ksdVar.c > 0) {
                byte a2 = ksdVar.a();
                if (a2 != 0) {
                    if (a2 == 1 || a2 == 2) {
                        if (i == 0) {
                            return 1;
                        }
                        if (i2 == 0) {
                            break;
                        }
                    } else if (a2 != 9) {
                        switch (a2) {
                            case 14:
                            case 15:
                                if (i2 == i) {
                                    return -1;
                                }
                                i--;
                                break;
                            case 16:
                            case 17:
                                if (i2 == i) {
                                    return 1;
                                }
                                i--;
                                break;
                            case 18:
                                i++;
                                break;
                            default:
                                if (i2 != 0) {
                                    break;
                                } else {
                                    break;
                                }
                                break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    if (i == 0) {
                        return -1;
                    }
                    if (i2 == 0) {
                        break;
                    }
                }
            }
            return 0;
        }
    }

    public final String b(String str) {
        return c(str, this.i);
    }

    public final String c(String str, ksg ksgVar) {
        String str2;
        if (str == null) {
            return null;
        }
        boolean a2 = ksgVar.a(str, str.length());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        boolean z = false;
        String str3 = "";
        if ((this.h & 2) != 0) {
            boolean a3 = (a2 ? ksk.b : ksk.a).a(str, str.length());
            if (!this.g) {
                if (a3 || d(str) == 1) {
                    str2 = e;
                    spannableStringBuilder.append((CharSequence) str2);
                } else {
                    a3 = false;
                }
            }
            str2 = (!this.g || (a3 && d(str) != -1)) ? "" : f;
            spannableStringBuilder.append((CharSequence) str2);
        }
        if (a2 != this.g) {
            spannableStringBuilder.append(true != a2 ? (char) 8234 : (char) 8235);
            spannableStringBuilder.append((CharSequence) str);
            spannableStringBuilder.append((char) 8236);
        } else {
            spannableStringBuilder.append((CharSequence) str);
        }
        boolean a4 = (a2 ? ksk.b : ksk.a).a(str, str.length());
        if (this.g) {
            z = a4;
        } else if (a4 || e(str) == 1) {
            str3 = e;
            spannableStringBuilder.append((CharSequence) str3);
            return spannableStringBuilder.toString();
        }
        if (this.g && (!z || e(str) == -1)) {
            str3 = f;
        }
        spannableStringBuilder.append((CharSequence) str3);
        return spannableStringBuilder.toString();
    }
}
