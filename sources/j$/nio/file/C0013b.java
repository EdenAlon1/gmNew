package j$.nio.file;

import java.nio.file.LinkOption;

/* renamed from: j$.nio.file.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C0013b implements CopyOption {
    public final /* synthetic */ java.nio.file.CopyOption a;

    private /* synthetic */ C0013b(java.nio.file.CopyOption copyOption) {
        this.a = copyOption;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [j$.nio.file.CopyOption, java.nio.file.StandardCopyOption] */
    /* JADX WARN: Type inference failed for: r1v3, types: [j$.nio.file.CopyOption, java.nio.file.StandardCopyOption] */
    /* JADX WARN: Type inference failed for: r1v4, types: [j$.nio.file.CopyOption, java.nio.file.StandardCopyOption] */
    /* JADX WARN: Type inference failed for: r1v6, types: [j$.nio.file.CopyOption, java.nio.file.LinkOption] */
    public static /* synthetic */ CopyOption a(java.nio.file.CopyOption copyOption) {
        ?? r1;
        ?? r12;
        ?? r13;
        ?? r14;
        if (copyOption == 0) {
            return null;
        }
        if (copyOption instanceof C0014c) {
            return ((C0014c) copyOption).a;
        }
        if (copyOption instanceof k) {
            r14 = LinkOption.NOFOLLOW_LINKS;
            return r14;
        }
        if (!(copyOption instanceof StandardCopyOption)) {
            return new C0013b(copyOption);
        }
        StandardCopyOption standardCopyOption = (StandardCopyOption) copyOption;
        if (standardCopyOption == StandardCopyOption.REPLACE_EXISTING) {
            r13 = java.nio.file.StandardCopyOption.REPLACE_EXISTING;
            return r13;
        }
        if (standardCopyOption == StandardCopyOption.COPY_ATTRIBUTES) {
            r12 = java.nio.file.StandardCopyOption.COPY_ATTRIBUTES;
            return r12;
        }
        r1 = java.nio.file.StandardCopyOption.ATOMIC_MOVE;
        return r1;
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.nio.file.CopyOption copyOption = this.a;
        if (obj instanceof C0013b) {
            obj = ((C0013b) obj).a;
        }
        return copyOption.equals(obj);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }
}
