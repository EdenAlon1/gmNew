package defpackage;

/* compiled from: PG */
/* loaded from: classes7.dex */
public final /* synthetic */ class cdsr {
    public static /* synthetic */ String a(CharSequence[] charSequenceArr) {
        StringBuilder sb = new StringBuilder();
        int length = charSequenceArr.length;
        sb.append(charSequenceArr[0]);
        for (int i = 1; i < charSequenceArr.length; i++) {
            sb.append((CharSequence) ",");
            sb.append(charSequenceArr[i]);
        }
        return sb.toString();
    }
}
